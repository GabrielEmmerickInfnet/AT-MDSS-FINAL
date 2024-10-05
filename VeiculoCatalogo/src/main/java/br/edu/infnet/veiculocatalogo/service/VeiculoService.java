package br.edu.infnet.veiculocatalogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.veiculocatalogo.model.Veiculo;
import br.edu.infnet.veiculocatalogo.repository.VeiculoRepository;

import java.util.List;
import java.util.Optional;

import static java.awt.SystemColor.info;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> findById(Integer id) {
        return veiculoRepository.findById(id);
    }

    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public void deleteById(Integer id) {
        veiculoRepository.deleteById(id);
    }
}
