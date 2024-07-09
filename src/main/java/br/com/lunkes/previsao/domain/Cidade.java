package br.com.lunkes.previsao.domain;

import javax.xml.bind.annotation.XmlElement;

public class Cidade {

    private String nome;
    private String uf;
    private int id;

    @XmlElement
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
