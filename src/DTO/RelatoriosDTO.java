package DTO;

import java.util.Date;

public class RelatoriosDTO {
    private Date inicioFiltro = new Date();
    private Date finalFiltro = new Date();
    private Date dataVenda = new Date();
    private int idVenda, totalItens, idProduto, quantidade;
    private double valorTVendas, valorTDetalhes, valorUnidade;
    private Long CPF;

    public Date getInicioFiltro() {
        return inicioFiltro;
    }

    public void setInicioFiltro(Date inicioFiltro) {
        this.inicioFiltro = inicioFiltro;
    }

    public Date getFinalFiltro() {
        return finalFiltro;
    }

    public void setFinalFiltro(Date finalFiltro) {
        this.finalFiltro = finalFiltro;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(int totalItens) {
        this.totalItens = totalItens;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTVendas() {
        return valorTVendas;
    }

    public void setValorTVendas(double valorTVendas) {
        this.valorTVendas = valorTVendas;
    }

    public double getValorTDetalhes() {
        return valorTDetalhes;
    }

    public void setValorTDetalhes(double valorTDetalhes) {
        this.valorTDetalhes = valorTDetalhes;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }
    
}
