package com.aula_banco1.Application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aula_banco1.entities.Pessoa;
import com.aula_banco1.entities.Venda;
import com.aula_banco1.repository.PessoaRepository;
import com.aula_banco1.repository.VendaRepository;

@Component
public class InserirDados implements CommandLineRunner {

  @Autowired
  private PessoaRepository pessoaRepository;

  @Autowired
  private VendaRepository vendaRepository;

  @Override
  public void run(String... args) throws Exception {
    List<Pessoa> pessoaLista = listarPessoas();
    pessoaRepository.saveAll(pessoaLista);

    List<Venda> vendaLista = listarVendas();
    vendaRepository.saveAll(vendaLista);
  }

  private List<Pessoa> listarPessoas() {
    List<Pessoa> pessoaList = new ArrayList<Pessoa>();

    for (int i = 0; i <= 100; i++) {
      Pessoa pessoa = new Pessoa();
      pessoa.setNome("Pessoa " + i);
      pessoa.setIdade(20);
      pessoa.setEmail("pessoa" + i + "@gmail.com");
      pessoaList.add(pessoa);
    }

    return pessoaList;
  }

  private List<Venda> listarVendas() {
    List<Venda> vendaList = new ArrayList<Venda>();

    for (int i = 0; i <= 4000; i++) {
      Venda venda = new Venda();
      venda.setDate(new Date());
      venda.setValor(new BigDecimal(100 + i));
      venda.setCliente(new Pessoa());
      venda.getCliente().setId(10);
      venda.setVendedor(new Pessoa());
      venda.getVendedor().setId(99);
      vendaList.add(venda);
    }

    return vendaList;
  }
}
