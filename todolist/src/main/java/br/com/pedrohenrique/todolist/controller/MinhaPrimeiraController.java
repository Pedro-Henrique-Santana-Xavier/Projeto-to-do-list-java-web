package br.com.pedrohenrique.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
  
  /** -|-Metodos de acesso do HTTP-|-
   * GET - Buscar uma informação
   * POST - Adicionar um dado/informação
   * PUT - Alterar um dado/informação
   * PATCH - Alterar somente uma parte do dado/informação
   * DELETE - Remover um dado
  */

  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem(){
    return "Funcionou";
  }
}
