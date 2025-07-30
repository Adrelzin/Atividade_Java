import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Emenda> emendas = new ArrayList<>();
        
        List<Documento> docs1 = new ArrayList<>();
        docs1.add(new Documento(LocalDate.of(2024, 3, 15), "empenho", 850000.00, "Transferência"));
        docs1.add(new Documento(LocalDate.of(2024, 5, 20), "liquidação", 850000.00, "Transferência"));
        docs1.add(new Documento(LocalDate.of(2024, 7, 10), "pagamento", 850000.00, "Transferência"));
        
        HashMap<String, String> convenios1 = new HashMap<>();
        convenios1.put("CONV001", "Prefeitura - Saúde Básica");
        
        HashMap<String, String> acordos1 = new HashMap<>();
        acordos1.put("AC001", "Acordo de Cooperação Técnica");
        
        EmendaIndividual emenda1 = new EmendaIndividual(
            1001, "Deputado A", 850000.00, 2024, "Individual",
            docs1, convenios1, acordos1,
            "Deputado A", "Transferências com Finalidade Definida"
        );
        emendas.add(emenda1);
        
        List<Documento> docs2 = new ArrayList<>();
        docs2.add(new Documento(LocalDate.of(2024, 2, 10), "empenho", 1200000.00, "PIX"));
        docs2.add(new Documento(LocalDate.of(2024, 4, 15), "liquidação", 1200000.00, "PIX"));
        docs2.add(new Documento(LocalDate.of(2024, 6, 25), "pagamento", 1200000.00, "PIX"));
        
        HashMap<String, String> convenios2 = new HashMap<>();
        convenios2.put("CONV002", "Estado - Educação");
        
        HashMap<String, String> acordos2 = new HashMap<>();
        
        EmendaIndividual emenda2 = new EmendaIndividual(
            1002, "Deputado B", 1200000.00, 2024, "Individual",
            docs2, convenios2, acordos2,
            "Deputado B", "Transferências Especiais (PIX)"
        );
        emendas.add(emenda2);
        
        List<Documento> docs3 = new ArrayList<>();
        docs3.add(new Documento(LocalDate.of(2024, 1, 20), "empenho", 950000.00, "Transferência"));
        docs3.add(new Documento(LocalDate.of(2024, 3, 30), "liquidação", 950000.00, "Transferência"));
        
        HashMap<String, String> convenios3 = new HashMap<>();
        convenios3.put("CONV003", "Município - Infraestrutura");
        
        HashMap<String, String> acordos3 = new HashMap<>();
        acordos3.put("AC003", "Termo de Execução");
        
        EmendaIndividual emenda3 = new EmendaIndividual(
            1003, "Senador C", 950000.00, 2024, "Individual",
            docs3, convenios3, acordos3,
            "Senador C", "Transferências com Finalidade Definida"
        );
        emendas.add(emenda3);
        
        List<Documento> docsBancada1 = new ArrayList<>();
        docsBancada1.add(new Documento(LocalDate.of(2024, 4, 5), "empenho", 5000000.00, "Infraestrutura"));
        docsBancada1.add(new Documento(LocalDate.of(2024, 6, 15), "liquidação", 3000000.00, "Infraestrutura"));
        docsBancada1.add(new Documento(LocalDate.of(2024, 8, 20), "pagamento", 2500000.00, "Infraestrutura"));
        
        HashMap<String, String> conveniosBancada1 = new HashMap<>();
        conveniosBancada1.put("CONVBAN001", "Estado - Rodovias");
        conveniosBancada1.put("CONVBAN002", "DNIT - BR-232");
        
        HashMap<String, String> acordosBancada1 = new HashMap<>();
        
        List<String> parlamentaresBancada1 = Arrays.asList("Deputado A", "Deputado B", "Senador C");
        
        EmendaDeBancada emendaBancada1 = new EmendaDeBancada(
            2001, "Bancada PE", 5000000.00, 2024, "Bancada",
            docsBancada1, conveniosBancada1, acordosBancada1,
            parlamentaresBancada1, "https://ata-bancada1.gov.br",
            "Deputado A", "PE"
        );
        emendas.add(emendaBancada1);
        
        List<Documento> docsBancada2 = new ArrayList<>();
        docsBancada2.add(new Documento(LocalDate.of(2024, 3, 10), "empenho", 3500000.00, "Saúde"));
        docsBancada2.add(new Documento(LocalDate.of(2024, 5, 25), "liquidação", 3500000.00, "Saúde"));
        
        HashMap<String, String> conveniosBancada2 = new HashMap<>();
        conveniosBancada2.put("CONVBAN003", "SUS - Hospitais");
        
        HashMap<String, String> acordosBancada2 = new HashMap<>();
        acordosBancada2.put("ACBAN001", "Convênio SUS");
        
        List<String> parlamentaresBancada2 = Arrays.asList("Deputado D", "Deputado E", "Senador F");
        
        EmendaDeBancada emendaBancada2 = new EmendaDeBancada(
            2002, "Bancada Saúde PE", 3500000.00, 2024, "Bancada",
            docsBancada2, conveniosBancada2, acordosBancada2,
            parlamentaresBancada2, "https://ata-bancada2.gov.br",
            "Deputado D", "PE"
        );
        emendas.add(emendaBancada2);
        
        List<Documento> docsBancada3 = new ArrayList<>();
        docsBancada3.add(new Documento(LocalDate.of(2024, 2, 15), "empenho", 2800000.00, "Educação"));
        docsBancada3.add(new Documento(LocalDate.of(2024, 4, 20), "liquidação", 2800000.00, "Educação"));
        docsBancada3.add(new Documento(LocalDate.of(2024, 6, 30), "pagamento", 2800000.00, "Educação"));
        
        HashMap<String, String> conveniosBancada3 = new HashMap<>();
        conveniosBancada3.put("CONVBAN004", "MEC - Universidades");
        
        HashMap<String, String> acordosBancada3 = new HashMap<>();
        
        List<String> parlamentaresBancada3 = Arrays.asList("Deputado G", "Senador H");
        
        EmendaDeBancada emendaBancada3 = new EmendaDeBancada(
            2003, "Bancada Educação PE", 2800000.00, 2024, "Bancada",
            docsBancada3, conveniosBancada3, acordosBancada3,
            parlamentaresBancada3, "https://ata-bancada3.gov.br",
            "Deputado G", "PE"
        );
        emendas.add(emendaBancada3);
        
        List<Documento> docsComissao1 = new ArrayList<>();
        docsComissao1.add(new Documento(LocalDate.of(2024, 2, 10), "empenho", 2500000.00, "Educação"));
        docsComissao1.add(new Documento(LocalDate.of(2024, 4, 20), "liquidação", 2500000.00, "Educação"));
        docsComissao1.add(new Documento(LocalDate.of(2024, 6, 30), "pagamento", 2500000.00, "Educação"));
        
        HashMap<String, String> conveniosComissao1 = new HashMap<>();
        conveniosComissao1.put("CONVCOM001", "MEC - Educação Superior");
        
        HashMap<String, String> acordosComissao1 = new HashMap<>();
        
        List<String> parlamentaresComissao1 = Arrays.asList("Deputado X", "Deputado Y", "Senador Z");
        
        EmendaDeComissao emendaComissao1 = new EmendaDeComissao(
            3001, "Comissão de Educação", 2500000.00, 2024, "Comissão",
            docsComissao1, conveniosComissao1, acordosComissao1,
            "https://comissao-educacao.gov.br", parlamentaresComissao1,
            "https://relatorio-educacao-2024.gov.br", "Deputado X"
        );
        emendas.add(emendaComissao1);
        
        List<Documento> docsComissao2 = new ArrayList<>();
        docsComissao2.add(new Documento(LocalDate.of(2024, 1, 15), "empenho", 1800000.00, "Meio Ambiente"));
        docsComissao2.add(new Documento(LocalDate.of(2024, 3, 25), "liquidação", 1800000.00, "Meio Ambiente"));
        
        HashMap<String, String> conveniosComissao2 = new HashMap<>();
        conveniosComissao2.put("CONVCOM002", "IBAMA - Preservação");
        
        HashMap<String, String> acordosComissao2 = new HashMap<>();
        acordosComissao2.put("ACCOM001", "Acordo Ambiental");
        
        List<String> parlamentaresComissao2 = Arrays.asList("Deputado W", "Senador V");
        
        EmendaDeComissao emendaComissao2 = new EmendaDeComissao(
            3002, "Comissão Meio Ambiente", 1800000.00, 2024, "Comissão",
            docsComissao2, conveniosComissao2, acordosComissao2,
            "https://comissao-ambiente.gov.br", parlamentaresComissao2,
            "https://relatorio-ambiente-2024.gov.br", "Deputado W"
        );
        emendas.add(emendaComissao2);
        
        List<Documento> docsComissao3 = new ArrayList<>();
        docsComissao3.add(new Documento(LocalDate.of(2024, 3, 5), "empenho", 3200000.00, "Saúde"));
        docsComissao3.add(new Documento(LocalDate.of(2024, 5, 10), "liquidação", 3200000.00, "Saúde"));
        docsComissao3.add(new Documento(LocalDate.of(2024, 7, 15), "pagamento", 3200000.00, "Saúde"));
        
        HashMap<String, String> conveniosComissao3 = new HashMap<>();
        conveniosComissao3.put("CONVCOM003", "MS - Hospitais");
        
        HashMap<String, String> acordosComissao3 = new HashMap<>();
        
        List<String> parlamentaresComissao3 = Arrays.asList("Deputado U", "Deputado T", "Senador S");
        
        EmendaDeComissao emendaComissao3 = new EmendaDeComissao(
            3003, "Comissão de Saúde", 3200000.00, 2024, "Comissão",
            docsComissao3, conveniosComissao3, acordosComissao3,
            "https://comissao-saude.gov.br", parlamentaresComissao3,
            "https://relatorio-saude-2024.gov.br", "Deputado U"
        );
        emendas.add(emendaComissao3);
        
        List<Documento> docsRelator1 = new ArrayList<>();
        docsRelator1.add(new Documento(LocalDate.of(2024, 1, 15), "empenho", 1800000.00, "Saúde"));
        docsRelator1.add(new Documento(LocalDate.of(2024, 3, 25), "liquidação", 1800000.00, "Saúde"));
        
        HashMap<String, String> conveniosRelator1 = new HashMap<>();
        conveniosRelator1.put("CONVREL001", "MS - Hospital Regional");
        
        HashMap<String, String> acordosRelator1 = new HashMap<>();
        acordosRelator1.put("ACREL001", "Convênio de Repasse");
        
        EmendaDeRelator emendaRelator1 = new EmendaDeRelator(
            4001, "Relator Geral", 1800000.00, 2024, "Relator",
            docsRelator1, conveniosRelator1, acordosRelator1,
            "Deputado R", "Senador Relator"
        );
        emendas.add(emendaRelator1);
        
        List<Documento> docsRelator2 = new ArrayList<>();
        docsRelator2.add(new Documento(LocalDate.of(2024, 2, 20), "empenho", 2200000.00, "Infraestrutura"));
        docsRelator2.add(new Documento(LocalDate.of(2024, 4, 30), "liquidação", 2200000.00, "Infraestrutura"));
        docsRelator2.add(new Documento(LocalDate.of(2024, 6, 15), "pagamento", 2200000.00, "Infraestrutura"));
        
        HashMap<String, String> conveniosRelator2 = new HashMap<>();
        conveniosRelator2.put("CONVREL002", "DNIT - Pontes");
        
        HashMap<String, String> acordosRelator2 = new HashMap<>();
        
        EmendaDeRelator emendaRelator2 = new EmendaDeRelator(
            4002, "Relator Infraestrutura", 2200000.00, 2024, "Relator",
            docsRelator2, conveniosRelator2, acordosRelator2,
            "Deputado Q", "Senador Relator 2"
        );
        emendas.add(emendaRelator2);
        
        List<Documento> docsRelator3 = new ArrayList<>();
        docsRelator3.add(new Documento(LocalDate.of(2024, 3, 12), "empenho", 1600000.00, "Agricultura"));
        docsRelator3.add(new Documento(LocalDate.of(2024, 5, 18), "liquidação", 1600000.00, "Agricultura"));
        
        HashMap<String, String> conveniosRelator3 = new HashMap<>();
        conveniosRelator3.put("CONVREL003", "INCRA - Desenvolvimento Rural");
        
        HashMap<String, String> acordosRelator3 = new HashMap<>();
        acordosRelator3.put("ACREL002", "Termo de Cooperação Rural");
        
        EmendaDeRelator emendaRelator3 = new EmendaDeRelator(
            4003, "Relator Agricultura", 1600000.00, 2024, "Relator",
            docsRelator3, conveniosRelator3, acordosRelator3,
            "Deputado P", "Senador Relator 3"
        );
        emendas.add(emendaRelator3);
        
        System.out.println("Sistema executado com sucesso!");
        System.out.println("Total de emendas criadas: " + emendas.size());
        
        for (Emenda emenda : emendas) {
            System.out.println(emenda);
        }
        
        System.out.println("\nCalculando valores por fase:");
        for (Emenda emenda : emendas) {
            double totalEmpenho = 0, totalLiquidacao = 0, totalPagamento = 0;
            
            for (Documento doc : emenda.getDocumentos()) {
                switch (doc.getFase().toLowerCase()) {
                    case "empenho":
                        totalEmpenho += doc.getValor();
                        break;
                    case "liquidação":
                        totalLiquidacao += doc.getValor();
                        break;
                    case "pagamento":
                        totalPagamento += doc.getValor();
                        break;
                }
            }
            
            System.out.printf("Emenda ID %d - Empenho: R$ %.2f, Liquidação: R$ %.2f, Pagamento: R$ %.2f%n", 
                emenda.getId(), totalEmpenho, totalLiquidacao, totalPagamento);
        }
    }
}
