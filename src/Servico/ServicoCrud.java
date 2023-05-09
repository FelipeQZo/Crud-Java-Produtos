package Servico;

import Entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class ServicoCrud implements Crud{

    private List<Produto> produtoList = new ArrayList<>();

    @Override
    public void salvarProduto(Produto produto) {
            produtoList.add(produto);
    }

    @Override
    public List<Produto> listarProdutos() {

        return produtoList;
    }

    @Override
    public void deletarProduto(Produto produto) {

        int index = produtoList.indexOf(produto);
        if (index>-1){
            produtoList.remove(produto);
        }
    }

    @Override
    public void alterarProduto(Produto produto) {
        int index= produtoList.indexOf(produto);
        System.out.println(index);
        if (index>-1){
            produtoList.set(index,produto);
        }

    }

}
