/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Consulta;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac-PC
 */
public final class HttpRequest {

    /**
     * Enviar peticiones de Actualizacion
     *
     * @param url la url del servidor
     * @param values el valor que pedimos
     * @return retorna la consulta
     */
    public static String POST_REQUEST(String url, String values) {
        try {
            StringBuilder result = new StringBuilder();
            URL url2 = new URL(url);
            URLConnection conn = url2.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(values);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            wr.close();
            rd.close();
            return result.toString();

        } catch (MalformedURLException e) {
            return e.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    public static void POST_REQUEST_IMAGE(String url, String ruta, File file) {
        try {
            StringBuilder result = new StringBuilder();
            URL url2 = new URL(url);
            URLConnection conn = url2.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            OutputStream os = conn.getOutputStream();
            Thread.sleep(1000);
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
            long totalByte = fis.available();
            long byteTrasferred = 0;
            for (int i = 0; i < totalByte; i++) {
                os.write(fis.read());
                byteTrasferred = i + 1;
            }
            os.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = null;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
            in.close();
            fis.close();

        } catch (IOException ex) {
            Logger.getLogger(HttpRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(HttpRequest.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public static void insertarImage(String nombreImage, File file) {
        String values = "filename=" + nombreImage;
//        System.out.println(values);
        HttpRequest.POST_REQUEST_IMAGE(Constantes.URL_INSERT_MASCOTA_IMAGE, nombreImage, file);
    }

    /**
     * Solicitar la ejecucion de consultas select
     *
     * @param url la url del servidor
     * @param values el valor que pedimos
     * @return retorna la consulta
     */
    public static String GET_REQUEST(String url, String values) {
        try {
            StringBuilder result = new StringBuilder();
            String URL = url + "?" + values;
            URL obj = new URL(URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                result.append(inputLine);
            }
            return result.toString();

        } catch (MalformedURLException e) {
            return e.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

    /**
     * Solicita la ejecucion de consultas select sin parametros
     *
     * @param url la url del servidor
     * @return retorna la consulta
     */
    public static String GET_REQUEST_SIN_PARAMETROS(String url) {
        try {
            StringBuilder result = new StringBuilder();
            String URL = url;
            URL obj = new URL(URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                result.append(inputLine);
            }
            return result.toString();

        } catch (MalformedURLException e) {
            return e.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }

}
