package projeto.orientacaoObjeto.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return  "\nTítulo = " + getTituloConteudo() +
                ", Descrição = " + getDescricaoConteudo() +
                ", Carga Horária = " + cargaHoraria+
                "\n";
    }
}



