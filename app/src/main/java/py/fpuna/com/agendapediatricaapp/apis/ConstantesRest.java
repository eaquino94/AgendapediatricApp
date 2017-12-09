package py.fpuna.com.agendapediatricaapp.apis;


public class ConstantesRest {

    public static final String urlBase = "http://10.0.10.11:8080/AgendaPediatrica/webresources/";

    //aqui es donde ponemos los servicios para otener los datos
    public static String API_VALDILAR_USUARIO = urlBase + "agendapediatrica.usuarios/ValidarUsuario";
    public static String API_GET_MOSTRAR_HIJO= urlBase + "agendapediatrica.usuarios/Mostrarhijo";
    public static String API_GET_VACUNAS = urlBase + "agendapediatrica.hijos/VacunasHijo";


}
