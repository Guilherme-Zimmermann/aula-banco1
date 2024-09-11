package com.aula_banco1.entities;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Date date;
  private BigDecimal valor;

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Pessoa cliente;

  @ManyToOne
  @JoinColumn(name = "vendedor_id")
  private Pessoa vendedor;

  public Venda() {
  }

  public Venda(Integer id, Date date, BigDecimal valor, Pessoa cliente, Pessoa vendedor) {
    this.id = id;
    this.date = date;
    this.valor = valor;
    this.cliente = cliente;
    this.vendedor = vendedor;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public Pessoa getCliente() {
    return cliente;
  }

  public void setCliente(Pessoa cliente) {
    this.cliente = cliente;
  }

  public Pessoa getVendedor() {
    return vendedor;
  }

  public void setVendedor(Pessoa vendedor) {
    this.vendedor = vendedor;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Venda other = (Venda) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
