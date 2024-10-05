package br.edu.infnet.veiculocatalogo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.veiculocatalogo.model.Veiculo;


public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
}
