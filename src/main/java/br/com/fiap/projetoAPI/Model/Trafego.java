package br.com.fiap.projetoAPI.Model;

import br.com.fiap.projetoAPI.DTO.TrafegoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TB_TRAFEGO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Trafego {
    @Id
    @Column(name = "ID_TRAFEGO")
    private Integer id;
    @Column(name = "HORA_TRAFEGO")
    private String hora;
    @Column(name = "VOLUME_TRAFEGO")
    private Integer volume;
    @Column(name = "SITUACAO_TRAFEGO")
    private Boolean situacao;

    public Trafego(TrafegoDTO trafegoDTO){
        this.id = trafegoDTO.id();
        this.hora = trafegoDTO.hora();
        this.volume = trafegoDTO.volume();
        this.situacao = trafegoDTO.situacao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }
}
