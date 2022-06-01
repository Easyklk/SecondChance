package Modelo;

import java.io.Serializable;

public class Respuesta implements Serializable {

    String code;
    String value;

    public Respuesta(String code, String value) {
        super();
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Respuesta [code=" + code + ", value=" + value + "]";
    }

}
