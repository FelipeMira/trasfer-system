package br.com.felipemira.transfer.application.domain.model;

import lombok.*;

// Responsavel por representar a entidade correntista e suas regras.
// Nao sera gerenciado pelo IoC e sim pelo repositorio.
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(setterPrefix = "with")
public class AccountHolder {
    @Getter@Setter
    private Long idAccountHolder;
    @Getter@Setter
    private String name;

    public AccountHolder(Long idAccountHolder){
        this.idAccountHolder = idAccountHolder;
    }
}
