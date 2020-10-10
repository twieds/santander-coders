import { ClienteService } from './../cliente.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastro-cliente',
  templateUrl: './cadastro-cliente.component.html',
  styleUrls: ['./cadastro-cliente.component.css']
})
export class CadastroClienteComponent implements OnInit {
  cliente = { id: '', nome: '', sobrenome: '', telefone: '', dataNascimento: '', cpf: '', rg: '', email: '' };

  constructor(private clienteService: ClienteService) { }

  ngOnInit(): void {
  }


  adicionar() {
    this.clienteService.adicionar(this.cliente).subscribe(() => {
    });
  }
}
