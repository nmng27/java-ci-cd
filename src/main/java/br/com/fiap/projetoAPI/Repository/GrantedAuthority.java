package br.com.fiap.projetoAPI.Repository;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {

    String getAuthority();
}
