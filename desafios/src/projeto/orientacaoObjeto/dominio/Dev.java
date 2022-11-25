package projeto.orientacaoObjeto.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){//quanddo se inscrever no bootcamp
        this.conteudosInscritos.addAll(bootcamp.getConteudos());// irá add todos os conteúdos incritos
        bootcamp.getDevsInscritos().add(this);// e add o dev no bootcamp, para falar que ele esta matriculado
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){//se o conteudo existe dentro de ConteudosInscritos
            this.conteudosConcluidos.add(conteudo.get());//add em Conteudosconcluidos
            this.conteudosInscritos.remove(conteudo.get());// remover dos conteudosInscritos
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");//caso a lista esteja vazia, mostra uma mensagem.
        }
    }

    public double calcularXP(){
       return this.conteudosConcluidos.stream()
               .mapToDouble(Conteudo::calcularXp).sum();//XP de cada conteudosConcluidos é somado.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
