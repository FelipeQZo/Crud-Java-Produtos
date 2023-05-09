package Servico;

import Entidades.Computador;
import Entidades.Produto;

import java.util.List;

public interface Crud {
    public void  salvarProduto(Produto produto);
    public List<Produto> listarProdutos();
    public void deletarProduto(Produto produto);
    public void alterarProduto(Produto produto);

}
