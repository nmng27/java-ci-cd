package br.com.fiap.projetoAPI.Repository;

import br.com.fiap.projetoAPI.Model.Trafego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafegoRepository extends JpaRepository<Trafego,Integer> {
}
