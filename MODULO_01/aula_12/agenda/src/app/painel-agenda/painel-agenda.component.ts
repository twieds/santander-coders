import { AgendaService } from './../agenda.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-painel-agenda',
  templateUrl: './painel-agenda.component.html',
  styleUrls: ['./painel-agenda.component.css']
})
export class PainelAgendaComponent implements OnInit {
  contato = { id: '', nome: '', telefone: '' };
  agenda = [];
  operacao = true;

  constructor(private agendaService: AgendaService) { }

  ngOnInit() {
    this.consultar();
  }
  consultar() {
    this.agendaService.listar().subscribe(resposta =>
      this.agenda = resposta as any);
  }
  inserirOuAtualizar() {
    if (this.operacao) {
      this.adicionar();
    } else {
      this.atualizar();
      this.operacao = true;
    }
  }
  editar(contato: any) {
    this.contato = { id: contato.id, nome: contato.nome, telefone: contato.telefone };
    this.operacao = false;
  }
  atualizar() {
    this.agendaService.atualizar(this.contato).subscribe(() => {
      this.contato = { id: '', nome: '', telefone: '' };
      this.consultar();
    });
  }
  adicionar() {
    this.agendaService.adicionar(this.contato).subscribe(() => {
      this.contato = { id: '', nome: '', telefone: '' };
      this.consultar();
    });
  }
  excluir(id: number) {
    this.agendaService.excluir(id).subscribe(() => {
      this.consultar();
    });
  }

}
