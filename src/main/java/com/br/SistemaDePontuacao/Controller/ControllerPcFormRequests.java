package com.br.SistemaDePontuacao.Controller;


import com.br.SistemaDePontuacao.Model.app.pcprofissionals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControllerPcFormRequests {
    private Integer codprofissional;
    private String Descricao;
    private String senha;
private Integer codbrinde;

    private String percomprof;
    private String tiposorteio;
    private String tipoprof;
    private Long codfunccad;
    private String profissao;
    private String cnpj;
    private String rg_ie;
    private String endereco;
    private String bairro;
    private String cep;
    private String fone;
    private String email;
    private String cidade;
    private String uf;
    private String celular;
    public pcprofissionals toModel(){
        return new pcprofissionals(codprofissional, Descricao, senha,codbrinde, percomprof, tiposorteio, tipoprof, codfunccad, profissao, cnpj, rg_ie, endereco, bairro, cep, fone, email, cidade, uf, celular);
    }
    
    public static ControllerPcFormRequests fromModel(pcprofissionals profissional){
        return new ControllerPcFormRequests(profissional.getCodprofissional(),profissional.getDescricao(),profissional.getSenha(),profissional.getCodbrinde(),profissional.getPercomprof(),profissional.getTipoprof(),
        profissional.getTiposorteio(),profissional.getCodfunccad(),profissional.getProfissao(),profissional.getCnpj(),profissional.getRg_ie(),profissional.getEndereco(),profissional.getBairro(),
        profissional.getCep(),profissional.getFone(),profissional.getEmail(),profissional.getCidade(),profissional.getUf(),profissional.getCelular());
    }
 
 


}
