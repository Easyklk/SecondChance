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

    //URLs servidores
    public static final String SERVER = "C:/xampp/htdocs/SecondChance/";
    public static final String SERVERCONSULTA = "http://localhost/SecondChance/ScriptsConsultas/";
    public static final String SERVERIMAGENES = "http://localhost/SecondChance/Imagenes/";
    public static final String SERVERMASCOTA = "http://localhost/SecondChance/ScriptsMascotas/";
    public static final String SERVERPROTECTORA = "http://localhost/SecondChance/ScriptsProtectoras/";
    public static final String SERVERUSUARIO = "http://localhost/SecondChance/ScriptsUsuarios/";

    //URLs Logueo
    public static final String URL_LOGUEO_ADMIN = SERVERUSUARIO + "consultaUsuario.php";
    public static final String URL_LOGUEO_PROTECTORA = SERVERPROTECTORA + "consultaProtectora.php";

    //URLs de inserción
    public static final String URL_INSERT_CONSULTA = SERVERCONSULTA + "insertarConsulta.php";
    public static final String URL_INSERT_MASCOTA = SERVERMASCOTA + "insertarMascota.php";
    public static final String URL_INSERT_MASCOTA_IMAGE = SERVERIMAGENES + "insertarImage.php";
    public static final String URL_INSERT_PROTECTORA = SERVERPROTECTORA + "insertarProtectora.php";
    public static final String URL_INSERT_USUARIO = SERVERUSUARIO + "insertarUsuario.php";

    //URLs de borrado
    public static final String URL_DELETE_CONSULTA = SERVERCONSULTA + "borrarConsulta.php";
    public static final String URL_DELETE_MASCOTA = SERVERMASCOTA + "borrarMascota.php";
    public static final String URL_DELETE_PROTECTORA = SERVERPROTECTORA + "borrarProtectora.php";
    public static final String URL_DELETE_USUARIO = SERVERUSUARIO + "borrarUsuario.php";

    //URLs de modificación
    public static final String URL_UPDATE_CONSULTA = SERVERCONSULTA + "modificarConsulta.php";
    public static final String URL_UPDATE_MASCOTA = SERVERMASCOTA + "modificarMascota.php";
    public static final String URL_UPDATE_PROTECTORA = SERVERPROTECTORA + "modificarProtectora.php";
    public static final String URL_UPDATE_USUARIO = SERVERUSUARIO + "modificarUsuario.php";
    public static final String URL_UPDATE_USUARIO_PASS = SERVERUSUARIO + "modificarUsuarioPass.php";

    //URLs de listados generales
    public static final String URL_LISTADOS_CONSULTAS = SERVERCONSULTA + "listarConsulta.php";
    public static final String URL_LISTADOS_PROTECTORAS = SERVERPROTECTORA + "listarProtectora.php";
    public static final String URL_LISTADOS_MASCOTA = SERVERMASCOTA + "listarMascota.php";
    public static final String URL_LISTADOS_USUARIO = SERVERUSUARIO + "listarUsuario.php";

    //URLs de listados con condición
    public static final String URL_LISTADOS_CONSULTA_COD_CIF_PROTECTORA = SERVERCONSULTA + "listarConsultaCodCifProtectora.php";
    public static final String URL_LISTADOS_CONSULTA_CIF_PROTECTORA = SERVERCONSULTA + "listarConsultaCifProtectora.php";
    public static final String URL_LISTADOS_CONSULTA_COD = SERVERCONSULTA + "listarConsultaCod.php";
    public static final String URL_LISTADOS_MASCOTA_COD = SERVERMASCOTA + "consultaMascotaCod.php";
    public static final String URL_LISTADOS_MASCOTA_COD_CIF_PROTECTORA = SERVERMASCOTA + "consultaMascotaCodCifProtectora.php";
    public static final String URL_LISTADOS_MASCOTA_CIF_PROTECTORA = SERVERMASCOTA + "listarMascotaCifProtectora.php";
    public static final String URL_LISTADOS_USUARIO_EMAIL = SERVERUSUARIO + "consultaUsuarioEmail.php";
    public static final String URL_LISTADOS_VOLUNTARIO_DNI = SERVERUSUARIO + "consultaVoluntarioDni.php";
    public static final String URL_LISTADOS_PROTECTORA_CIF = SERVERPROTECTORA + "consultaProtectoraCif.php";
    public static final String URL_LISTADOS_PROTECTORA_EMAIL = SERVERPROTECTORA + "consultaProtectoraEmail.php";

    //Mensajes informtivos DML
    public static final String CR_OK_INSERT = "OK_INSERT";
    public static final String CR_OK_DELETE = "OK_DELETE";
    public static final String CR_ERROR = "CR_ERROR";
}
