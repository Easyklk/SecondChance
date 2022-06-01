/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

/**
 *
 * @author Easyklk
 */
public interface Constantes {

    public static final String UNO = "administrador";
    public static final String DOS = "protectora";
    public static final String SERVER = "C:/xampp/htdocs/SecondChance/";
    public static final String SERVERCONSULTA = "http://localhost/SecondChance/ScriptsConsultas/";
    public static final String SERVERIMAGENES = "http://localhost/SecondChance/Imagenes/";
    public static final String SERVERMASCOTA = "http://localhost/SecondChance/ScriptsMascotas/";
    public static final String SERVERPROTECTORA = "http://localhost/SecondChance/ScriptsProtectoras/";
    public static final String SERVERUSUARIO = "http://localhost/SecondChance/ScriptsUsuarios/";
    public static final String SERVERVOLUNTARIO = "http://localhost/SecondChance/ScriptsVoluntarios/";

    public static final String URL_LOGUEO_ADMIN = SERVERUSUARIO + "consultaUsuario.php";
    public static final String URL_LOGUEO_PROTECTORA = SERVERPROTECTORA + "consultaProtectora.php";

    public static final String URL_INSERT_CONSULTA = SERVERCONSULTA + "insertarConsulta.php";
    public static final String URL_INSERT_MASCOTA = SERVERMASCOTA + "insertarMascota.php";
    public static final String URL_INSERT_MASCOTA_IMAGE = SERVERIMAGENES + "insertarImage.php";
    public static final String URL_INSERT_PROTECTORA = SERVERPROTECTORA + "insertarProtectora.php";
    public static final String URL_INSERT_USUARIO = SERVERUSUARIO + "insertarUsuario.php";

    public static final String URL_DELETE_CONSULTA = SERVERCONSULTA + "borrarConsulta.php";
    public static final String URL_DELETE_MASCOTA = SERVERMASCOTA + "borrarMascota.php";
    public static final String URL_DELETE_MASCOTA_IMAGE = SERVERIMAGENES + "borrarImage.php";
    public static final String URL_DELETE_PROTECTORA = SERVERPROTECTORA + "borrarProtectora.php";
    public static final String URL_DELETE_USUARIO = SERVERUSUARIO + "borrarUsuario.php";

    public static final String URL_UPDATE_CONSULTA = SERVERCONSULTA + "modificarConsulta.php";
    public static final String URL_UPDATE_MASCOTA = SERVERMASCOTA + "modificarMascota.php";
    public static final String URL_UPDATE_PROTECTORA = SERVERPROTECTORA + "modificarProtectora.php";
    public static final String URL_UPDATE_USUARIO = SERVERUSUARIO + "modificarUsuario.php";

    public static final String URL_LISTADOS_CONSULTAS = SERVERCONSULTA + "listarConsultas.php";
    public static final String URL_LISTADOS_PROTECTORAS = SERVERPROTECTORA + "listarProtectora.php";
    public static final String URL_LISTADOS_MASCOTA = SERVERMASCOTA + "listarMascota.php";
    public static final String URL_LISTADOS_USUARIO = SERVERUSUARIO + "listarUsuario.php";

    public static final String URL_LISTADOS_CONSULTA_COD = SERVERCONSULTA + "consultaConsultaCod.php";
    public static final String URL_LISTADOS_MASCOTA_COD = SERVERMASCOTA + "consultaMascotaCod.php";
    public static final String URL_LISTADOS_USUARIO_EMAIL = SERVERUSUARIO + "consultaUsuarioEmail.php";
    public static final String URL_LISTADOS_PROTECTORA_CIF = SERVERPROTECTORA + "consultaProtectoraCif.php";
    public static final String URL_LISTADOS_PROTECTORA_EMAIL = SERVERPROTECTORA + "consultaProtectoraEmail.php";

    public static final String CR_OK = "CR_OK";
    public static final String CR_ERROR = "CR_ERROR";
}
