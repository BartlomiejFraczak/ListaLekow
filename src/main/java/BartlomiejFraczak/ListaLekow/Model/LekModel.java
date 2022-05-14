package BartlomiejFraczak.ListaLekow.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Leki")
public class LekModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "nazwa_leku")
    @NotNull
    private String nazwa_leku;

    @Column(name = "data_waznosci")
    @NotNull
    private LocalDate data_waznosci;

    @Column(name = "ilosc_opakowan_w_magazynie")
    @NotNull
    private int ilosc_opakowan_w_magazynie;

    public LekModel() {
    }

    public LekModel(String nazwa_leku, LocalDate data_waznosci, int ilosc_opakowan_w_magazynie) {
        this.nazwa_leku = nazwa_leku;
        this.data_waznosci = data_waznosci;
        this.ilosc_opakowan_w_magazynie = ilosc_opakowan_w_magazynie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa_leku() {
        return nazwa_leku;
    }

    public void setNazwa_leku(String nazwa_leku) {
        this.nazwa_leku = nazwa_leku;
    }

    public LocalDate getData_waznosci() {
        return data_waznosci;
    }

    public void setData_waznosci(LocalDate data_waznosci) {
        this.data_waznosci = data_waznosci;
    }

    public int getIlosc_opakowan_w_magazynie() {
        return ilosc_opakowan_w_magazynie;
    }

    public void setIlosc_opakowan_w_magazynie(int ilosc_opakowan_w_magazynie) {
        this.ilosc_opakowan_w_magazynie = ilosc_opakowan_w_magazynie;
    }
}
