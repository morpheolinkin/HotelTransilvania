package dominio;

import java.util.Date;

public class Reserva {
    private int codigo;
    private Date dataReserva;
    private Date dataCadastro;
    private int quantidadeDiarias;
    private Lider lider;
    private Romaria romaria;

    public Reserva() {

    }

    public Reserva(int codigo, Date dataReserva, Date dataCadastro,
                   int quantidadeDiarias, Lider lider, Romaria romaria) {
        this.codigo = codigo;
        this.dataReserva = dataReserva;
        this.dataCadastro = dataCadastro;
        this.quantidadeDiarias = quantidadeDiarias;
        this.lider = lider;
        this.romaria = romaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public Lider getLider() {
        return lider;
    }

    public void setLider(Lider lider) {
        this.lider = lider;
    }

    public Romaria getRomaria() {
        return romaria;
    }

    public void setRomaria(Romaria romaria) {
        this.romaria = romaria;
    }
}
