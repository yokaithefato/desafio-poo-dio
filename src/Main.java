import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.OrdenarRanking;

import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev( "Camila", 0);
        devCamila.setNome("Camila");
        devCamila.setXP_PADRAO(0);
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("joao", 0);
        devJoao.setNome("Joao");
        devJoao.setXP_PADRAO(0);
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");

        Dev devWallace = new Dev("Wallace", 0);
        devWallace.setNome("Wallace");
        devWallace.setXP_PADRAO(0);
        devWallace.inscreverBootcamp(bootcamp);
        
        devWallace.progredir();
    
        System.out.println("-");
      
        System.out.println("XP:" + devWallace.calcularTotalXp());

        OrdenarRanking ordenarRanking = new OrdenarRanking();
        ordenarRanking.adicionarDev(devCamila.getNome(), devCamila.calcularTotalXp());
        ordenarRanking.adicionarDev(devJoao.getNome(), devJoao.calcularTotalXp());
        ordenarRanking.adicionarDev(devWallace.getNome(), devWallace.calcularTotalXp());


        /**  Ordenar e exibir o ranking com lambda
        *System.out.println("Ranking dos Devs por XP:");
        *ordenarRanking.ordenadoPorXp().forEach(dev -> 
        *    System.out.println(dev.getNome() + " - XP: " + dev.getXP_PADRAO())
        );
        */
        //Ordenar e exibir o ranking sem lambda
          List<Dev> ranking = ordenarRanking.ordenadoPorXp();
        System.out.println("Ranking dos Devs por XP:");
        for (Dev dev : ranking) {
            System.out.println(dev.getNome() + " - XP: " + dev.getXP_PADRAO());
        }

    }

}
