package br.com.lunkes.previsao.soap;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.lunkes.previsao.domain.Cidade;

@XmlRootElement(name = "cidades")
public class Cidades {

    private List<Cidade> cidades;

    @XmlElement(name = "cidade")
    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
}

