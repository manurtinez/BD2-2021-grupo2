package bd2.utils;

import bd2.model.*;
import bd2.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.SimpleDateFormat;

public class DBInitializer {

    @Autowired
    MLService service;

    public void prepareDB() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        User user001 = service.createUser("rubnnieto644@hotmail.com", "Rubén Nieto", "velidoo3530",
                sdf.parse("25/4/1941"));
        User user002 = service.createUser("silviamuoz449@yahoo.com", "Silvia Muñoz", "sdemoomdco3877",
                sdf.parse("3/8/1996"));
        User user003 = service.createUser("marianaalonso510@hotmail.com", "Mariana Alonso", "utlnsi2956",
                sdf.parse("9/9/1973"));
        User user004 = service.createUser("florenciaarias552@fruit.net", "Florencia Arias", "modocmortroto1820",
                sdf.parse("7/8/1948"));
        User user005 = service.createUser("silviaparra914@gmail.com", "Silvia Parra", "ma,gnaut2431",
                sdf.parse("2/8/1997"));
        User user006 = service.createUser("santinogarca360@fruit.net", "Santino García", ",gamnamodmo,oc2146",
                sdf.parse("12/9/1967"));
        User user007 = service.createUser("norbertonieto272@yahoo.com", "Norberto Nieto", ".udinlis3902",
                sdf.parse("19/12/1994"));
        User user008 = service.createUser("fernandarodrguez132@fruit.net", "Fernanda Rodríguez", "siab,pdu,odmomoc3262",
                sdf.parse("24/3/1999"));
        User user009 = service.createUser("beatrizlorenzo363@yahoo.com", "Beatriz Lorenzo", "eslltuoneDc1729",
                sdf.parse("15/10/1983"));
        User user010 = service.createUser("paulagallardo223@me.com", "Paula Gallardo", "temasseueqliecr1911",
                sdf.parse("14/7/1971"));
        User user011 = service.createUser("carlosmarn888@yahoo.com", "Carlos Marín", ".risusctesouetcrn651",
                sdf.parse("16/2/1980"));
        User user012 = service.createUser("javieriglesias867@hotmail.com", "Javier Iglesias", "etumnemfrenDoc2950",
                sdf.parse("26/7/2003"));
        User user013 = service.createUser("carlacarmona597@hotmail.com", "Carla Carmona", "evltemidonnmcu2388",
                sdf.parse("12/9/2001"));
        User user014 = service.createUser("carlavelasco211@hotmail.com", "Carla Velasco", ",abdpsuiDnceo677",
                sdf.parse("5/3/1984"));
        User user015 = service.createUser("nataliocabrera950@yahoo.com", "Natalio Cabrera", "csusurntcnmdmeuoi1625",
                sdf.parse("10/10/1958"));
        User user016 = service.createUser("norbertomartin389@gmail.com", "Norberto Martin", "ametuntsrtceoec96",
                sdf.parse("6/9/1961"));
        User user017 = service.createUser("santiagomartin638@yahoo.com", "Santiago Martin", "rtntseeoccuaimrus835",
                sdf.parse("6/9/1948"));
        User user018 = service.createUser("soniaherrero88@fruit.net", "Sonia Herrero", "rrtotosde3652",
                sdf.parse("24/8/1945"));
        User user019 = service.createUser("matiasnieto391@yahoo.com", "Matias Nieto", "nb,ihevl3141",
                sdf.parse("12/8/1949"));
        User user020 = service.createUser("florenciavzquez510@fruit.net", "Florencia Vázquez", "tosujnumoectimdn2976",
                sdf.parse("23/1/1990"));
        User user021 = service.createUser("carlosherrero230@hotmail.com", "Carlos Herrero", "etamevl154",
                sdf.parse("13/8/1966"));
        User user022 = service.createUser("rubnvzquez199@me.com", "Rubén Vázquez", "ntumodencmicmodtmunnie1177",
                sdf.parse("2/4/1970"));
        User user023 = service.createUser("soniagutirrez377@me.com", "Sonia Gutiérrez", "diapub,s.te1051",
                sdf.parse("28/1/2000"));
        User user024 = service.createUser("eduardosoler125@hotmail.com", "Eduardo Soler", "masurirtotor1307",
                sdf.parse("7/2/1985"));
        User user025 = service.createUser("carlospascual813@hotmail.com", "Carlos Pascual", "uteslltu2653",
                sdf.parse("22/4/2001"));
        User user026 = service.createUser("carlosmolina654@gmail.com", "Carlos Molina", "ujostsnli2048",
                sdf.parse("18/8/1984"));
        User user027 = service.createUser("anamuoz935@gmail.com", "Ana Muñoz", "omo,cdmolisn1384",
                sdf.parse("2/12/1998"));
        User user028 = service.createUser("rubnpastor650@yahoo.com", "Rubén Pastor", "coecturnsetdab,psiu2296",
                sdf.parse("21/4/1996"));
        User user029 = service.createUser("paulamorales955@yahoo.com", "Paula Morales", "cuurssaassm1538",
                sdf.parse("2/6/1985"));
        User user030 = service.createUser("maracalvo55@yahoo.com", "María Calvo", "hi,nbhni,b1556",
                sdf.parse("6/7/1973"));
        User user031 = service.createUser("norbertolorenzo506@gmail.com", "Norberto Lorenzo", "rstneucoectu,iabdsp319",
                sdf.parse("11/2/1992"));
        User user032 = service.createUser("paulavega426@me.com", "Paula Vega", "ceoDncsruus2108",
                sdf.parse("21/1/1953"));
        User user033 = service.createUser("alfredomontero165@fruit.net", "Alfredo Montero", "uamrsi.uid657",
                sdf.parse("12/5/1964"));
        User user034 = service.createUser("florenciaserrano776@me.com", "Florencia Serrano", "desa,mang58",
                sdf.parse("2/3/1945"));
        User user035 = service.createUser("santinopascual801@gmail.com", "Santino Pascual", "rtoorttjsou3745",
                sdf.parse("2/2/1959"));
        User user036 = service.createUser("silviaherrera620@hotmail.com", "Silvia Herrera", "aetsPernac1235",
                sdf.parse("17/2/1956"));
        User user037 = service.createUser("marionieto493@hotmail.com", "Mario Nieto", "ectcenostursiuarm1755",
                sdf.parse("13/1/1965"));
        User user038 = service.createUser("florenciamartnez248@gmail.com", "Florencia Martínez", "dmoomcosde2917",
                sdf.parse("4/6/1952"));
        User user039 = service.createUser("juangarrido158@hotmail.com", "Juan Garrido", "a,sdpiubeltslu1969",
                sdf.parse("22/9/1977"));
        User user040 = service.createUser("anarubio889@me.com", "Ana Rubio", "asamssqilcuesere838",
                sdf.parse("1/4/1949"));
        User user041 = service.createUser("anajimnez703@yahoo.com", "Ana Jiménez", "nfeeumrtmdes2764",
                sdf.parse("8/7/1973"));
        User user042 = service.createUser("maragallego519@fruit.net", "María Gallego", "dserusmai439",
                sdf.parse("24/6/1988"));
        User user043 = service.createUser("silviaromero99@me.com", "Silvia Romero", "ag,namoiod390",
                sdf.parse("22/10/1985"));
        User user044 = service.createUser("robertogil710@gmail.com", "Roberto Gil", "ematmtae3488",
                sdf.parse("11/8/1973"));
        User user045 = service.createUser("soniaromn649@hotmail.com", "Sonia Román", "eeuqslericsmruais94",
                sdf.parse("17/7/1952"));
        User user046 = service.createUser("nataliogil226@yahoo.com", "Natalio Gil", "veluessceqlrie3179",
                sdf.parse("16/1/1952"));
        User user047 = service.createUser("alfredopea59@me.com", "Alfredo Peña", "odoisurscu175",
                sdf.parse("7/6/1961"));
        User user048 = service.createUser("javiervicente915@hotmail.com", "Javier Vicente", "cased2372",
                sdf.parse("25/5/1998"));
        User user049 = service.createUser("mariomoreno923@hotmail.com", "Mario Moreno", "toesecnrcutFsecu2156",
                sdf.parse("3/4/1949"));
        User user050 = service.createUser("rubncruz68@yahoo.com", "Rubén Cruz", "stjoutis1388", sdf.parse("8/4/1944"));
        User user051 = service.createUser("rubnarias691@yahoo.com", "Rubén Arias", "eeriuqcesslmate2701",
                sdf.parse("8/8/1996"));
        User user052 = service.createUser("beatriztorres299@fruit.net", "Beatriz Torres", "tlsuleoiod115",
                sdf.parse("4/10/2005"));
        User user053 = service.createUser("marianaserrano962@hotmail.com", "Mariana Serrano", "sdeemuotinmdnc1494",
                sdf.parse("9/4/1963"));
        User user054 = service.createUser("rubnmuoz534@fruit.net", "Rubén Muñoz", "stiiarums1421",
                sdf.parse("14/5/2005"));
        User user055 = service.createUser("soniacarrasco962@gmail.com", "Sonia Carrasco", "usmirarsusuc1273",
                sdf.parse("6/4/2001"));
        User user056 = service.createUser("paulamoya351@fruit.net", "Paula Moya", "cad.iu674", sdf.parse("13/11/1979"));
        User user057 = service.createUser("soniacarmona590@me.com", "Sonia Carmona", "odienutnmmcusjto1678",
                sdf.parse("27/11/1965"));
        User user058 = service.createUser("soniasnchez89@fruit.net", "Sonia Sánchez", "uurcssdse93",
                sdf.parse("4/1/1962"));
        User user059 = service.createUser("silviasez765@gmail.com", "Silvia Sáez", "veldes3723",
                sdf.parse("26/11/1942"));
        User user060 = service.createUser("marianatorres885@me.com", "Mariana Torres", "utcussru507",
                sdf.parse("4/4/1978"));
        User user061 = service.createUser("robertolpez741@yahoo.com", "Roberto López", "tmaetsi413",
                sdf.parse("24/8/1986"));
        User user062 = service.createUser("soniablanco393@hotmail.com", "Sonia Blanco", "uteccnertosut1867",
                sdf.parse("24/9/2004"));
        User user063 = service.createUser("fernandacrespo261@fruit.net", "Fernanda Crespo", "i.duiamsru263",
                sdf.parse("9/4/1958"));
        User user064 = service.createUser("fernandasanz490@hotmail.com", "Fernanda Sanz", "desPatresne2708",
                sdf.parse("27/1/1948"));
        User user065 = service.createUser("silviaibez85@hotmail.com", "Silvia Ibáñez", "inlssuFec119",
                sdf.parse("16/11/1992"));
        User user066 = service.createUser("norbertoparra146@gmail.com", "Norberto Parra", "eatmca3036",
                sdf.parse("1/7/1983"));
        User user067 = service.createUser("luzmontero304@fruit.net", "Luz Montero", "otujseds1694",
                sdf.parse("7/1/1994"));
        User user068 = service.createUser("marianacano492@gmail.com", "Mariana Cano", "qsselreeucitmea2184",
                sdf.parse("18/6/1959"));
        User user069 = service.createUser("norbertopascual230@fruit.net", "Norberto Pascual", "umrsiancoDe846",
                sdf.parse("8/7/1962"));
        User user070 = service.createUser("carlosgil902@fruit.net", "Carlos Gil", "gaa,nmrss.ui223",
                sdf.parse("7/9/1991"));
        User user071 = service.createUser("eduardoparra772@gmail.com", "Eduardo Parra", "ecsuFssruuc3516",
                sdf.parse("2/2/1948"));
        User user072 = service.createUser("luzmartin563@gmail.com", "Luz Martin", "noceD,odomcmo1055",
                sdf.parse("24/7/1960"));
        User user073 = service.createUser("carlacarmona56@gmail.com", "Carla Carmona", "netaePsrhn,ib472",
                sdf.parse("7/9/1950"));
        User user074 = service.createUser("rubnrubio919@fruit.net", "Rubén Rubio", "manag,llseut3342",
                sdf.parse("14/6/1990"));
        User user075 = service.createUser("matiasherrero831@gmail.com", "Matias Herrero", "sruucsrortto2165",
                sdf.parse("17/9/1940"));
        User user076 = service.createUser("seleneduran205@yahoo.com", "Selene Duran", "samsasmasa2203",
                sdf.parse("26/6/1982"));
        User user077 = service.createUser("selenecalvo23@hotmail.com", "Selene Calvo", "utncDeo1430",
                sdf.parse("7/7/1980"));
        User user078 = service.createUser("juansantiago305@yahoo.com", "Juan Santiago", "nislllutes1737",
                sdf.parse("12/4/2005"));
        User user079 = service.createUser("mariopastor398@fruit.net", "Mario Pastor", "amssatu2984",
                sdf.parse("19/5/1973"));
        User user080 = service.createUser("nataliolozano986@yahoo.com", "Natalio Lozano", "aubs,pidmomoocd376",
                sdf.parse("26/10/1987"));
        User user081 = service.createUser("carlosmartin90@hotmail.com", "Carlos Martin", ".duie.t860",
                sdf.parse("8/3/1951"));
        User user082 = service.createUser("selenecarmona754@gmail.com", "Selene Carmona", "comdmoossrcuu2762",
                sdf.parse("25/3/2001"));
        User user083 = service.createUser("matiasgarca37@hotmail.com", "Matias García", "eettcnucosrrsiecqseuel2117",
                sdf.parse("20/5/1974"));
        User user084 = service.createUser("carlosmolina746@yahoo.com", "Carlos Molina", "trortoits782",
                sdf.parse("22/6/1973"));
        User user085 = service.createUser("carlospascual402@hotmail.com", "Carlos Pascual", "lvemcdooom1187",
                sdf.parse("5/3/1974"));
        User user086 = service.createUser("selenegimnez107@yahoo.com", "Selene Giménez", "temamdm,ocoo3405",
                sdf.parse("18/1/1972"));
        User user087 = service.createUser("marianasoto106@gmail.com", "Mariana Soto", "nilshinb,1545",
                sdf.parse("1/8/1959"));
        User user088 = service.createUser("silvialpez130@me.com", "Silvia López", "ab,spduienoDc3547",
                sdf.parse("27/10/2000"));
        User user089 = service.createUser("eduardoromero805@me.com", "Eduardo Romero", "Dneocom,ocdom699",
                sdf.parse("7/4/1970"));
        User user090 = service.createUser("selenemartin186@yahoo.com", "Selene Martin", "evllulest2459",
                sdf.parse("18/4/1943"));
        User user091 = service.createUser("carlosbentez611@me.com", "Carlos Benítez", "coDenac1755",
                sdf.parse("14/2/1981"));
        User user092 = service.createUser("luzmuoz883@hotmail.com", "Luz Muñoz", "du.icsrusu1610",
                sdf.parse("26/8/1969"));
        User user093 = service.createUser("silviasez428@gmail.com", "Silvia Sáez", ",oocomdmtjsuo1534",
                sdf.parse("11/3/1991"));
        User user094 = service.createUser("paulapascual180@fruit.net", "Paula Pascual", "odmo,moceDonc1049",
                sdf.parse("4/12/1941"));
        User user095 = service.createUser("luzsnchez683@fruit.net", "Luz Sánchez", "aasmsrususc3730",
                sdf.parse("12/1/1988"));
        User user096 = service.createUser("paulacaballero154@yahoo.com", "Paula Caballero", "nslihnbi,3709",
                sdf.parse("18/4/1970"));
        User user097 = service.createUser("matiascampos731@me.com", "Matias Campos", "sinlarPsenet2579",
                sdf.parse("27/11/1966"));
        User user098 = service.createUser("javiercampos785@yahoo.com", "Javier Campos", "sirus.ooid2154",
                sdf.parse("25/8/1981"));
        User user099 = service.createUser("santiagoserrano157@yahoo.com", "Santiago Serrano", "stouj.et2496",
                sdf.parse("28/11/1991"));
        User user100 = service.createUser("javierduran958@me.com", "Javier Duran", "ematcsruus2548",
                sdf.parse("1/5/1953"));
        User user101 = service.createUser("silviagmez915@gmail.com", "Silvia Gómez", "tsjuoibhn,2838",
                sdf.parse("22/2/1981"));
        User user102 = service.createUser("beatrizromn845@hotmail.com", "Beatriz Román", "cetunctrseocrusus2316",
                sdf.parse("9/9/1948"));
        User user103 = service.createUser("florenciaalonso505@yahoo.com", "Florencia Alonso", "oiodca147",
                sdf.parse("19/7/1989"));
        User user104 = service.createUser("juanhernndez237@gmail.com", "Juan Hernández", "snileirleuesqsc2796",
                sdf.parse("12/8/1953"));
        User user105 = service.createUser("nataliocarrasco173@yahoo.com", "Natalio Carrasco", "massalsni627",
                sdf.parse("21/10/1945"));
        User user106 = service.createUser("maradelgado605@fruit.net", "María Delgado", "aasmseltlsu2731",
                sdf.parse("9/3/1986"));
        User user107 = service.createUser("luzsanz144@me.com", "Luz Sanz", "cssuurmtae1452", sdf.parse("27/6/1986"));
        User user108 = service.createUser("florenciamorales682@hotmail.com", "Florencia Morales", "lsinPrnaeets868",
                sdf.parse("17/1/1945"));
        User user109 = service.createUser("norbertoibez506@gmail.com", "Norberto Ibáñez", "n,mgaaisaurm3258",
                sdf.parse("14/10/1983"));
        User user110 = service.createUser("maralen739@gmail.com", "María León", "gaam,nvle1888", sdf.parse("4/3/1979"));
        Provider provider001 = this.service.createProvider("Refrigeracion MG Repuestos", 20535001383L);
        Provider provider002 = this.service.createProvider("Efece Service y Repuestos", 20768243182L);
        Provider provider003 = this.service.createProvider("Acuatec", 22863157806L);
        Provider provider004 = this.service.createProvider("Grupo Nucleo S.A.", 21093244147L);
        Provider provider005 = this.service.createProvider("Flamune", 22154387544L);
        Provider provider006 = this.service.createProvider("AyResLaPlata", 21791443865L);
        Provider provider007 = this.service.createProvider("Electrhogar", 20797034312L);
        Provider provider008 = this.service.createProvider("Otero La Cumbre", 20755688687L);
        Provider provider009 = this.service.createProvider("Martin & Martin", 21859773715L);
        Provider provider010 = this.service.createProvider("Repuestos LH", 20216827355L);
        Provider provider011 = this.service.createProvider("Repuesto Hogar", 22217370475L);
        Provider provider012 = this.service.createProvider("Servi Hogar - Servicio Técnico Electrodomésticos Liliana",
                21345562344L);
        Provider provider013 = this.service.createProvider("Electrogas", 20866309668L);
        Provider provider014 = this.service.createProvider("La Plata Service", 21066587978L);
        Provider provider015 = this.service.createProvider("Seara Refrigeración S.H.", 21144155310L);
        Provider provider016 = this.service.createProvider("Refrigeracion daniel", 22818304146L);
        Provider provider017 = this.service.createProvider("Repuestos para el Hogar", 20237767677L);
        Provider provider018 = this.service.createProvider("Electrodomesticos Repuestos", 20161354048L);
        Category balanzasdeBao = this.service.createCategory("Balanzas de Baño");
        Product product001 = this.service.createProduct("Balanza Atma BA7604N", 4205.0F, balanzasdeBao);
        Product product002 = this.service.createProduct("Balanza digital Daewoo DBS-4210", 5323.0F, balanzasdeBao);
        Product product003 = this.service.createProduct("Balanza digital San-Up PS5008 negra", 3583.0F, balanzasdeBao);
        Product product004 = this.service.createProduct("Nebulizador a pistón Omron NE-C801 blanco 100V/240V", 6925.0F,
                balanzasdeBao);
        Product product005 = this.service.createProduct("Nebulizador a pistón Silfab Pixel blanco 220V", 7183.0F,
                balanzasdeBao);
        Product product006 = this.service.createProduct("Nebulizador ultrasónico Silfab Potenza blanco 220V", 2175.0F,
                balanzasdeBao);
        Category lavarropasyLavasecarropas = this.service.createCategory("Lavarropas y Lavasecarropas");
        Product product007 = this.service.createProduct("Lavarropas automático Drean Next 8.12 ECO blanco 8kg 220 V",
                3718.0F, lavarropasyLavasecarropas);
        Product product008 = this.service.createProduct("Lavarropas  automático Drean Concept 5.05 blanco 5kg 220 V",
                5763.0F, lavarropasyLavasecarropas);
        Product product009 = this.service.createProduct(
                "Lavasecarropas  automático Candy Alisè GVFWFL4139 inverter anthracite 13kg 220 V", 2682.0F,
                lavarropasyLavasecarropas);
        Product product010 = this.service.createProduct(
                "Lavarropas  automático Samsung WW90J5410G inverter plata 9kg 220 V", 2052.0F,
                lavarropasyLavasecarropas);
        Product product011 = this.service.createProduct(
                "Lavarropas  automático Samsung WW90J5410G inverter blanco 9kg 220 V", 2348.0F,
                lavarropasyLavasecarropas);
        Product product012 = this.service.createProduct("Lavarropas  automático Drean Next 6.06 ECO blanco 6kg 220 V",
                3609.0F, lavarropasyLavasecarropas);
        Product product013 = this.service.createProduct("Lavarropas  automático Candy CST68D blanco 6kg 220 V", 6399.0F,
                lavarropasyLavasecarropas);
        Product product014 = this.service.createProduct("Lavarropas Whirlpool Carga Frontal 8 Kg - 1200 Rpm Wlf80ab",
                628.0F, lavarropasyLavasecarropas);
        Category lavavajillas = this.service.createCategory("Lavavajillas");
        Product product015 = this.service.createProduct(
                "Lavavajillas Whirlpool WSFO3T2 de 10 cubiertos blanco 220V - 240V", 4229.0F, lavavajillas);
        Product product016 = this.service.createProduct(
                "Lavavajillas Whirlpool WLV14 de 14 cubiertos blanco 220V - 240V", 3053.0F, lavavajillas);
        Product product017 = this.service.createProduct(
                "Lavavajillas Whirlpool WLV14 de 14 cubiertos plateado 220V - 240V", 739.0F, lavavajillas);
        Product product018 = this.service.createProduct(
                "Lavavajillas Drean Dish 15.2 DT de 15 cubiertos acero inoxidable y negro 220V", 4713.0F, lavavajillas);
        Product product019 = this.service.createProduct(
                "Lavavajillas Whirlpool WSFO3T2 de 10 cubiertos acero inoxidable 220V - 240V", 2218.0F, lavavajillas);
        Product product020 = this.service.createProduct("Lavavajillas Drean Dish 15.2 DT de 15 cubiertos blanco 220V",
                7868.0F, lavavajillas);
        Category extractoresyPurificadores = this.service.createCategory("Extractores y Purificadores");
        Product product021 = this.service.createProduct(
                "Extractor purificador cocina TST Lanin ac. inox. de pared 600mm x 295mm x 510mm acero inoxidable 220V",
                1225.0F, extractoresyPurificadores);
        Product product022 = this.service.createProduct(
                "Extractor purificador cocina TST Atuel ac. inox. de pared 600mm x 40mm x 510mm acero inoxidable 220V",
                7831.0F, extractoresyPurificadores);
        Product product023 = this.service.createProduct(
                "Extractor purificador cocina TST Lanin ac. inox. de pared 900mm x 295mm x 510mm acero inoxidable 220V",
                3231.0F, extractoresyPurificadores);
        Product product024 = this.service.createProduct(
                "Extractor purificador cocina TST Traful ac. inox. de pared 900mm x 250mm x 510mm acero inoxidable 220V",
                2722.0F, extractoresyPurificadores);
        Product product025 = this.service.createProduct("Extractor De Aire Purificador De Cocina Embassy 3 Veloc",
                240.0F, extractoresyPurificadores);
        Product product026 = this.service.createProduct(
                "Purificador cocina Whirlpool WAB60 ac. inox. empotrable 60cm x 15cm x 51cm plateado 220V", 5431.0F,
                extractoresyPurificadores);
        Product product027 = this.service.createProduct(
                "Extractor purificador cocina Eslabón de Lujo EAB60AB empotrable 60cm x 15cm x 51cm blanco 220V",
                905.0F, extractoresyPurificadores);
        Category airesAcondicionados = this.service.createCategory("Aires Acondicionados");
        Product product028 = this.service.createProduct(
                "Aire acondicionado BGH split frío/calor 2967 frigorías blanco 220V BS35WCCR", 2556.0F,
                airesAcondicionados);
        Product product029 = this.service.createProduct(
                "Aire acondicionado Philco split frío/calor 2881 frigorías blanco 220V - 240V PHS32HA3AN", 3700.0F,
                airesAcondicionados);
        Product product030 = this.service.createProduct(
                "Aire acondicionado BGH Silent Air split frío/calor 4400 frigorías blanco 220V BS45CP", 379.0F,
                airesAcondicionados);
        Product product031 = this.service.createProduct(
                "Aire acondicionado Alaska split frío/calor 3000 frigorías blanco 220V ALS35WCCR", 5585.0F,
                airesAcondicionados);
        Product product032 = this.service.createProduct(
                "Aire acondicionado Hyundai split inverter frío/calor 2924 frigorías blanco 220V HY6INV-3200FC",
                1538.0F, airesAcondicionados);
        Category ablandadoresdeAgua = this.service.createCategory("Ablandadores de Agua");
        Product product033 = this.service.createProduct("Ablandador Y Filtro De Agua Doble Para Aguas Muy Duras Caño",
                5187.0F, ablandadoresdeAgua);
        Product product034 = this.service.createProduct("Kit P/ Medición De Dureza (sarro)", 2050.0F,
                ablandadoresdeAgua);
        Product product035 = this.service.createProduct("Ablandador Y Filtro De Agua Doble W-s. Para Aguas Muy Duras.",
                7196.0F, ablandadoresdeAgua);
        Product product036 = this.service.createProduct("Liquido Ablandador De Durezas Fuerte Dr. Duval X 1000cc",
                7755.0F, ablandadoresdeAgua);
        Product product037 = this.service.createProduct("Ablandador De Agua Automático Residencial Elektrim Hf 2500 ",
                2102.0F, ablandadoresdeAgua);
        Product product038 = this.service.createProduct("Filtro Repuesto Elimina Sarro Y Dureza Del Agua Ablandador",
                1517.0F, ablandadoresdeAgua);
        Category anafes = this.service.createCategory("Anafes");
        Product product039 = this.service.createProduct("Anafe eléctrico Nura NR-HP1500PM  negro 220V - 240V", 4087.0F,
                anafes);
        Product product040 = this.service.createProduct("Anafe a gas Florencia Flor 6748I  acero inoxidable 220V",
                2867.0F, anafes);
        Product product041 = this.service.createProduct("Anafe eléctrico Ultracomb AN-2211  negro 220V", 585.0F,
                anafes);
        Product product042 = this.service.createProduct("Anafe eléctrico Winco W40  negro 220V", 5793.0F, anafes);
        Product product043 = this.service.createProduct("Anafe eléctrico Samsung CTR264KC01  negro 220V", 497.0F,
                anafes);
        Category cocinas = this.service.createCategory("Cocinas");
        Product product044 = this.service.createProduct(
                "Cocina Whirlpool WF876XG gas natural 5 hornallas acero inoxidable 220V puerta con visor 103L", 6939.0F,
                cocinas);
        Product product045 = this.service.createProduct(
                "Cocina Whirlpool WFX57DI  multigas 4 hornallas  acero inoxidable 220V puerta  con visor", 3594.0F,
                cocinas);
        Product product046 = this.service.createProduct(
                "Cocina Florencia Recta 5517F  multigas 4 hornallas  negra puerta  con visor", 4012.0F, cocinas);
        Product product047 = this.service.createProduct(
                "Cocina Escorial Candor S2  multigas 4 hornallas  blanca 220V puerta  con visor", 1304.0F, cocinas);
        Product product048 = this.service.createProduct(
                "Cocina Escorial Master  multigas 4 hornallas  blanca 220V puerta  con visor", 5247.0F, cocinas);
        Product product049 = this.service.createProduct(
                "Cocina Florencia Recta 5518F  multigas 4 hornallas  acero inoxidable puerta  con visor", 6266.0F,
                cocinas);
        Product product050 = this.service.createProduct(
                "Cocina Escorial Candor  multigas 4 hornallas  blanca 220V puerta  con visor", 5553.0F, cocinas);
        Product product051 = this.service.createProduct("Cocina Industrial Saho Jitaku 55 Visor - Ahora 18 + Envio Sc",
                7335.0F, cocinas);
        Product product052 = this.service.createProduct("Cocina Industrial Saho Jitaku 550 Visor + Envio Sin Cargo",
                342.0F, cocinas);
        Category calderas = this.service.createCategory("Calderas");
        Product product053 = this.service.createProduct("Caldera Peisa Diva Duo Ds 32000 Kcal Tiro Forzado", 688.0F,
                calderas);
        Product product054 = this.service.createProduct(
                "Caldera Mural Orbis 230cto Solo Calefaccion 29000 Kcal Tiro Natural Con Envio", 3551.0F, calderas);
        Product product055 = this.service.createProduct("Caldera Mural Orbis 230cto Calefaccion 30000 Kcal + Envio",
                2132.0F, calderas);
        Product product056 = this.service.createProduct("Caldera A Gas Baxi Eco 4s 24 Doble Servicio Tiro Forzado",
                3726.0F, calderas);
        Category chimeneasySalamandras = this.service.createCategory("Chimeneas y Salamandras");
        Product product057 = this.service.createProduct("Salamandra Tromen Pehuen 9500 Kcal Kit Negro Techo Ahora 12",
                1678.0F, chimeneasySalamandras);
        Product product058 = this.service.createProduct("Salamandra Estufas Tromen Kit Caños 6  Instalación Techo ",
                4831.0F, chimeneasySalamandras);
        Product product059 = this.service.createProduct("Salamandras Tromen Kit Instalación Basico Pared Accesorios 6",
                1672.0F, chimeneasySalamandras);
        Product product060 = this.service.createProduct("Salamandra A Leña Tromen Pehuen 9500 Kcal/h 106 M2 Cuotas",
                3289.0F, chimeneasySalamandras);
        Product product061 = this.service.createProduct("Salamandra A Leña Tromen Pehuen 7500 Kcal/h Kit Negro Techo",
                2356.0F, chimeneasySalamandras);
        Category dispensersdeAgua = this.service.createCategory("Dispensers de Agua");
        Product product062 = this.service.createProduct("Dispenser de agua Ziller Frío/Calor blanco 220V", 2654.0F,
                dispensersdeAgua);
        Product product063 = this.service.createProduct("Dispenser De Agua Frio Calor Premium Con Compresor Mas Frio!",
                6628.0F, dispensersdeAgua);
        Product product064 = this.service.createProduct("Dispenser De Agua Fresca Y Caliente Conexion A Red Silver!!!",
                3833.0F, dispensersdeAgua);
        Product product065 = this.service.createProduct("Dispenser Agua Fresca Caliente Mesada Para Red Jetcooler",
                2367.0F, dispensersdeAgua);
        Product product066 = this.service.createProduct("Dispenser De Agua Automatico Bomba Dispensador Bidones Usb",
                1056.0F, dispensersdeAgua);
        Product product067 = this.service.createProduct("Purificador Ósmosis Inversa 5 Etapas Aqua Home", 6972.0F,
                dispensersdeAgua);
        Product product068 = this.service.createProduct("Ósmosis Inversa 1600lpd Hidrolit Romi 400 + Repuestos 3 Años",
                4691.0F, dispensersdeAgua);
        Product product069 = this.service.createProduct("Osmosis Inversa Hidrowater Nereo Booster - C/bomba Y Tanque",
                931.0F, dispensersdeAgua);
        Product product070 = this.service.createProduct("Kit De 3 Filtros Para Ósmosis Inversa", 6113.0F,
                dispensersdeAgua);
        Product product071 = this.service.createProduct("Bomba Diafragma 24v. Para Ósmosis Inversa.", 7764.0F,
                dispensersdeAgua);
        Product product072 = this.service.createProduct("Ósmosis Inversa, Romi Plus Hidrolit", 4174.0F,
                dispensersdeAgua);
        Category artefactosparaelCabello = this.service.createCategory("Artefactos para el Cabello");
        Product product073 = this.service.createProduct(
                "Combo de cortadora y recortadora de pelo Wahl Home Deluxe Groom Pro plata 220V", 7310.0F,
                artefactosparaelCabello);
        Product product074 = this.service.createProduct("Secador De Pelo 1900w - Tedge", 808.0F,
                artefactosparaelCabello);
        Product product075 = this.service.createProduct(
                "Planchita de pelo GA.MA Italy Elegance Bella Tourmaline Ion negra 110V/220V", 7758.0F,
                artefactosparaelCabello);
        Product product076 = this.service.createProduct("Cortadora de pelo Wahl Home EasyCut ", 256.0F,
                artefactosparaelCabello);
        Product product077 = this.service.createProduct("Cortadora de pelo Wahl Home Quick Cut ", 5937.0F,
                artefactosparaelCabello);
        Product product078 = this.service.createProduct("Kit Revlon Secador + Planchita Profesional Essentials Pelo",
                7811.0F, artefactosparaelCabello);
        Product product079 = this.service.createProduct("Cortadora de pelo GA.MA Italy GM 562 ", 5141.0F,
                artefactosparaelCabello);
        Product product080 = this.service.createProduct("Secador De Pelo 22000w", 1560.0F, artefactosparaelCabello);
        Product product081 = this.service.createProduct("Revlon Secador", 3138.0F, artefactosparaelCabello);
        Product product082 = this.service.createProduct(
                "Planchita de pelo BaByliss PRO Nano Titanium 2091 BABNT2091T azul 220V", 1607.0F,
                artefactosparaelCabello);
        ProductOnSale pos001 = this.service.createProductOnSale(product026, provider001, 94542.0F,
                sdf.parse("22/11/2019"));
        ProductOnSale pos002 = this.service.createProductOnSale(product026, provider001, 112504.0F,
                sdf.parse("8/3/2020"));
        ProductOnSale pos003 = this.service.createProductOnSale(product041, provider004, 94431.0F,
                sdf.parse("9/9/2019"));
        ProductOnSale pos004 = this.service.createProductOnSale(product041, provider004, 114261.0F,
                sdf.parse("24/12/2019"));
        ProductOnSale pos005 = this.service.createProductOnSale(product052, provider004, 92070.0F,
                sdf.parse("19/11/2020"));
        ProductOnSale pos006 = this.service.createProductOnSale(product052, provider004, 115087.0F,
                sdf.parse("13/2/2021"));
        ProductOnSale pos007 = this.service.createProductOnSale(product052, provider004, 124293.0F,
                sdf.parse("20/4/2021"));
        ProductOnSale pos008 = this.service.createProductOnSale(product016, provider012, 53314.0F,
                sdf.parse("13/3/2020"));
        ProductOnSale pos009 = this.service.createProductOnSale(product047, provider015, 33766.0F,
                sdf.parse("9/6/2019"));
        ProductOnSale pos010 = this.service.createProductOnSale(product047, provider015, 42207.0F,
                sdf.parse("3/9/2019"));
        ProductOnSale pos011 = this.service.createProductOnSale(product003, provider018, 70283.0F,
                sdf.parse("14/8/2019"));
        ProductOnSale pos012 = this.service.createProductOnSale(product003, provider018, 86448.0F,
                sdf.parse("5/11/2019"));
        ProductOnSale pos013 = this.service.createProductOnSale(product041, provider001, 53115.0F,
                sdf.parse("3/12/2020"));
        ProductOnSale pos014 = this.service.createProductOnSale(product041, provider001, 57895.0F,
                sdf.parse("29/3/2021"));
        ProductOnSale pos015 = this.service.createProductOnSale(product041, provider001, 72368.0F,
                sdf.parse("20/6/2021"));
        ProductOnSale pos016 = this.service.createProductOnSale(product001, provider010, 26776.0F,
                sdf.parse("19/11/2019"));
        ProductOnSale pos017 = this.service.createProductOnSale(product001, provider010, 31863.0F,
                sdf.parse("28/1/2020"));
        ProductOnSale pos018 = this.service.createProductOnSale(product006, provider003, 39518.0F,
                sdf.parse("5/4/2019"));
        ProductOnSale pos019 = this.service.createProductOnSale(product006, provider003, 49397.0F,
                sdf.parse("22/6/2019"));
        ProductOnSale pos020 = this.service.createProductOnSale(product006, provider003, 55818.0F,
                sdf.parse("1/10/2019"));
        ProductOnSale pos021 = this.service.createProductOnSale(product045, provider003, 67636.0F,
                sdf.parse("22/11/2020"));
        ProductOnSale pos022 = this.service.createProductOnSale(product048, provider015, 82521.0F,
                sdf.parse("26/11/2019"));
        ProductOnSale pos023 = this.service.createProductOnSale(product048, provider015, 93248.0F,
                sdf.parse("22/3/2020"));
        ProductOnSale pos024 = this.service.createProductOnSale(product048, provider015, 101640.0F,
                sdf.parse("20/6/2020"));
        ProductOnSale pos025 = this.service.createProductOnSale(product053, provider008, 17379.0F,
                sdf.parse("3/9/2019"));
        ProductOnSale pos026 = this.service.createProductOnSale(product053, provider008, 20159.0F,
                sdf.parse("7/12/2019"));
        ProductOnSale pos027 = this.service.createProductOnSale(product053, provider008, 21973.0F,
                sdf.parse("27/2/2020"));
        ProductOnSale pos028 = this.service.createProductOnSale(product020, provider014, 15167.0F,
                sdf.parse("19/8/2019"));
        ProductOnSale pos029 = this.service.createProductOnSale(product020, provider014, 20020.0F,
                sdf.parse("29/10/2019"));
        ProductOnSale pos030 = this.service.createProductOnSale(product041, provider012, 56149.0F,
                sdf.parse("14/11/2019"));
        ProductOnSale pos031 = this.service.createProductOnSale(product041, provider012, 64009.0F,
                sdf.parse("5/3/2020"));
        ProductOnSale pos032 = this.service.createProductOnSale(product041, provider012, 84491.0F,
                sdf.parse("10/5/2020"));
        ProductOnSale pos033 = this.service.createProductOnSale(product034, provider015, 28740.0F,
                sdf.parse("14/7/2019"));
        ProductOnSale pos034 = this.service.createProductOnSale(product005, provider015, 21569.0F,
                sdf.parse("4/9/2020"));
        ProductOnSale pos035 = this.service.createProductOnSale(product005, provider015, 25235.0F,
                sdf.parse("9/11/2020"));
        ProductOnSale pos036 = this.service.createProductOnSale(product005, provider015, 34067.0F,
                sdf.parse("15/1/2021"));
        ProductOnSale pos037 = this.service.createProductOnSale(product027, provider003, 80228.0F,
                sdf.parse("16/4/2020"));
        ProductOnSale pos038 = this.service.createProductOnSale(product082, provider015, 56823.0F,
                sdf.parse("12/5/2020"));
        ProductOnSale pos039 = this.service.createProductOnSale(product082, provider015, 62505.0F,
                sdf.parse("10/8/2020"));
        ProductOnSale pos040 = this.service.createProductOnSale(product035, provider011, 59647.0F,
                sdf.parse("8/10/2020"));
        ProductOnSale pos041 = this.service.createProductOnSale(product035, provider011, 65015.0F,
                sdf.parse("29/12/2020"));
        ProductOnSale pos042 = this.service.createProductOnSale(product035, provider011, 87770.0F,
                sdf.parse("29/3/2021"));
        ProductOnSale pos043 = this.service.createProductOnSale(product019, provider010, 36149.0F,
                sdf.parse("2/2/2019"));
        ProductOnSale pos044 = this.service.createProductOnSale(product019, provider010, 48078.0F,
                sdf.parse("13/4/2019"));
        ProductOnSale pos045 = this.service.createProductOnSale(product079, provider011, 54820.0F,
                sdf.parse("12/9/2019"));
        ProductOnSale pos046 = this.service.createProductOnSale(product043, provider009, 28629.0F,
                sdf.parse("15/10/2019"));
        ProductOnSale pos047 = this.service.createProductOnSale(product043, provider009, 35499.0F,
                sdf.parse("30/1/2020"));
        ProductOnSale pos048 = this.service.createProductOnSale(product066, provider015, 16431.0F,
                sdf.parse("10/9/2019"));
        ProductOnSale pos049 = this.service.createProductOnSale(product066, provider015, 18402.0F,
                sdf.parse("4/12/2019"));
        ProductOnSale pos050 = this.service.createProductOnSale(product066, provider015, 24658.0F,
                sdf.parse("2/4/2020"));
        ProductOnSale pos051 = this.service.createProductOnSale(product060, provider002, 85455.0F,
                sdf.parse("10/5/2020"));
        ProductOnSale pos052 = this.service.createProductOnSale(product060, provider002, 111091.0F,
                sdf.parse("19/7/2020"));
        ProductOnSale pos053 = this.service.createProductOnSale(product060, provider002, 145529.0F,
                sdf.parse("28/9/2020"));
        ProductOnSale pos054 = this.service.createProductOnSale(product059, provider006, 45960.0F,
                sdf.parse("22/9/2019"));
        ProductOnSale pos055 = this.service.createProductOnSale(product059, provider006, 56990.0F,
                sdf.parse("4/12/2019"));
        ProductOnSale pos056 = this.service.createProductOnSale(product019, provider002, 80663.0F,
                sdf.parse("18/12/2019"));
        ProductOnSale pos057 = this.service.createProductOnSale(product019, provider002, 100022.0F,
                sdf.parse("27/3/2020"));
        ProductOnSale pos058 = this.service.createProductOnSale(product076, provider010, 60958.0F,
                sdf.parse("21/9/2020"));
        ProductOnSale pos059 = this.service.createProductOnSale(product043, provider007, 66269.0F,
                sdf.parse("10/10/2020"));
        ProductOnSale pos060 = this.service.createProductOnSale(product026, provider007, 47542.0F,
                sdf.parse("14/10/2020"));
        ProductOnSale pos061 = this.service.createProductOnSale(product054, provider006, 43491.0F,
                sdf.parse("7/8/2020"));
        ProductOnSale pos062 = this.service.createProductOnSale(product054, provider006, 53059.0F,
                sdf.parse("20/10/2020"));
        ProductOnSale pos063 = this.service.createProductOnSale(product054, provider006, 63140.0F,
                sdf.parse("21/1/2021"));
        ProductOnSale pos064 = this.service.createProductOnSale(product019, provider011, 26300.0F,
                sdf.parse("18/8/2019"));
        ProductOnSale pos065 = this.service.createProductOnSale(product067, provider005, 34627.0F,
                sdf.parse("22/12/2019"));
        ProductOnSale pos066 = this.service.createProductOnSale(product067, provider005, 37743.0F,
                sdf.parse("5/4/2020"));
        ProductOnSale pos067 = this.service.createProductOnSale(product021, provider005, 71168.0F,
                sdf.parse("15/3/2019"));
        ProductOnSale pos068 = this.service.createProductOnSale(product021, provider005, 95365.0F,
                sdf.parse("30/6/2019"));
        ProductOnSale pos069 = this.service.createProductOnSale(product021, provider005, 117298.0F,
                sdf.parse("1/10/2019"));
        ProductOnSale pos070 = this.service.createProductOnSale(product054, provider010, 77791.0F,
                sdf.parse("21/3/2019"));
        ProductOnSale pos071 = this.service.createProductOnSale(product054, provider010, 98016.0F,
                sdf.parse("7/6/2019"));
        ProductOnSale pos072 = this.service.createProductOnSale(product054, provider010, 114678.0F,
                sdf.parse("2/9/2019"));
        ProductOnSale pos073 = this.service.createProductOnSale(product029, provider004, 10014.0F,
                sdf.parse("20/9/2020"));
        ProductOnSale pos074 = this.service.createProductOnSale(product010, provider013, 59286.0F,
                sdf.parse("10/11/2020"));
        ProductOnSale pos075 = this.service.createProductOnSale(product010, provider013, 74700.0F,
                sdf.parse("24/1/2021"));
        ProductOnSale pos076 = this.service.createProductOnSale(product010, provider013, 85905.0F,
                sdf.parse("4/5/2021"));
        ProductOnSale pos077 = this.service.createProductOnSale(product080, provider001, 1459.0F,
                sdf.parse("9/3/2020"));
        ProductOnSale pos078 = this.service.createProductOnSale(product005, provider012, 6125.0F,
                sdf.parse("20/2/2020"));
        ProductOnSale pos079 = this.service.createProductOnSale(product005, provider012, 8268.0F,
                sdf.parse("6/6/2020"));
        ProductOnSale pos080 = this.service.createProductOnSale(product005, provider012, 10583.0F,
                sdf.parse("14/8/2020"));
        ProductOnSale pos081 = this.service.createProductOnSale(product081, provider008, 7249.0F,
                sdf.parse("5/7/2020"));
        ProductOnSale pos082 = this.service.createProductOnSale(product004, provider017, 95129.0F,
                sdf.parse("20/11/2019"));
        ProductOnSale pos083 = this.service.createProductOnSale(product004, provider017, 105593.0F,
                sdf.parse("17/2/2020"));
        ProductOnSale pos084 = this.service.createProductOnSale(product004, provider017, 141494.0F,
                sdf.parse("9/5/2020"));
        ProductOnSale pos085 = this.service.createProductOnSale(product063, provider009, 22127.0F,
                sdf.parse("10/2/2020"));
        ProductOnSale pos086 = this.service.createProductOnSale(product063, provider009, 23675.0F,
                sdf.parse("7/6/2020"));
        ProductOnSale pos087 = this.service.createProductOnSale(product010, provider004, 63704.0F,
                sdf.parse("10/7/2019"));
        ProductOnSale pos088 = this.service.createProductOnSale(product010, provider004, 68163.0F,
                sdf.parse("15/10/2019"));
        ProductOnSale pos089 = this.service.createProductOnSale(product046, provider004, 79917.0F,
                sdf.parse("12/4/2019"));
        ProductOnSale pos090 = this.service.createProductOnSale(product046, provider004, 105490.0F,
                sdf.parse("22/7/2019"));
        ProductOnSale pos091 = this.service.createProductOnSale(product078, provider013, 71043.0F,
                sdf.parse("17/8/2019"));
        ProductOnSale pos092 = this.service.createProductOnSale(product078, provider013, 84541.0F,
                sdf.parse("16/11/2019"));
        ProductOnSale pos093 = this.service.createProductOnSale(product078, provider013, 107367.0F,
                sdf.parse("8/3/2020"));
        ProductOnSale pos094 = this.service.createProductOnSale(product060, provider015, 96630.0F,
                sdf.parse("7/7/2020"));
        ProductOnSale pos095 = this.service.createProductOnSale(product007, provider011, 21198.0F,
                sdf.parse("28/6/2020"));
        ProductOnSale pos096 = this.service.createProductOnSale(product007, provider011, 24165.0F,
                sdf.parse("7/9/2020"));
        ProductOnSale pos097 = this.service.createProductOnSale(product070, provider001, 32795.0F,
                sdf.parse("8/7/2019"));
        ProductOnSale pos098 = this.service.createProductOnSale(product070, provider001, 35746.0F,
                sdf.parse("7/10/2019"));
        ProductOnSale pos099 = this.service.createProductOnSale(product070, provider001, 44682.0F,
                sdf.parse("28/12/2019"));
        ProductOnSale pos100 = this.service.createProductOnSale(product009, provider005, 10702.0F,
                sdf.parse("18/4/2019"));
        ProductOnSale pos101 = this.service.createProductOnSale(product009, provider005, 14447.0F,
                sdf.parse("7/8/2019"));
        ProductOnSale pos102 = this.service.createProductOnSale(product009, provider005, 16902.0F,
                sdf.parse("2/12/2019"));
        ProductOnSale pos103 = this.service.createProductOnSale(product007, provider004, 75667.0F,
                sdf.parse("24/2/2020"));
        ProductOnSale pos104 = this.service.createProductOnSale(product060, provider004, 51297.0F,
                sdf.parse("13/1/2019"));
        ProductOnSale pos105 = this.service.createProductOnSale(product060, provider004, 64634.0F,
                sdf.parse("26/4/2019"));
        ProductOnSale pos106 = this.service.createProductOnSale(product060, provider004, 80792.0F,
                sdf.parse("25/7/2019"));
        ProductOnSale pos107 = this.service.createProductOnSale(product046, provider007, 31633.0F,
                sdf.parse("21/6/2020"));
        ProductOnSale pos108 = this.service.createProductOnSale(product046, provider007, 36061.0F,
                sdf.parse("13/10/2020"));
        ProductOnSale pos109 = this.service.createProductOnSale(product046, provider007, 38585.0F,
                sdf.parse("18/1/2021"));
        ProductOnSale pos110 = this.service.createProductOnSale(product058, provider018, 75011.0F,
                sdf.parse("28/4/2020"));
        ProductOnSale pos111 = this.service.createProductOnSale(product082, provider016, 76168.0F,
                sdf.parse("14/10/2020"));
        ProductOnSale pos112 = this.service.createProductOnSale(product082, provider016, 81499.0F,
                sdf.parse("28/12/2020"));
        ProductOnSale pos113 = this.service.createProductOnSale(product072, provider007, 4630.0F,
                sdf.parse("26/1/2019"));
        ProductOnSale pos114 = this.service.createProductOnSale(product072, provider007, 5370.0F,
                sdf.parse("30/4/2019"));
        ProductOnSale pos115 = this.service.createProductOnSale(product072, provider007, 7195.0F,
                sdf.parse("16/7/2019"));
        ProductOnSale pos116 = this.service.createProductOnSale(product055, provider007, 78280.0F,
                sdf.parse("14/6/2019"));
        ProductOnSale pos117 = this.service.createProductOnSale(product055, provider007, 93936.0F,
                sdf.parse("27/8/2019"));
        ProductOnSale pos118 = this.service.createProductOnSale(product050, provider004, 8584.0F,
                sdf.parse("26/5/2020"));
        ProductOnSale pos119 = this.service.createProductOnSale(product007, provider006, 83543.0F,
                sdf.parse("18/1/2020"));
        ProductOnSale pos120 = this.service.createProductOnSale(product007, provider006, 97745.0F,
                sdf.parse("9/4/2020"));
        ProductOnSale pos121 = this.service.createProductOnSale(product041, provider011, 33883.0F,
                sdf.parse("13/7/2019"));
        ProductOnSale pos122 = this.service.createProductOnSale(product048, provider001, 63501.0F,
                sdf.parse("25/12/2020"));
        ProductOnSale pos123 = this.service.createProductOnSale(product048, provider001, 69216.0F,
                sdf.parse("5/3/2021"));
        ProductOnSale pos124 = this.service.createProductOnSale(product048, provider001, 91365.0F,
                sdf.parse("8/5/2021"));
        ProductOnSale pos125 = this.service.createProductOnSale(product048, provider017, 14180.0F,
                sdf.parse("26/12/2020"));
        ProductOnSale pos126 = this.service.createProductOnSale(product048, provider017, 15172.0F,
                sdf.parse("18/3/2021"));
        ProductOnSale pos127 = this.service.createProductOnSale(product048, provider017, 18965.0F,
                sdf.parse("6/7/2021"));
        ProductOnSale pos128 = this.service.createProductOnSale(product056, provider014, 4043.0F,
                sdf.parse("10/8/2019"));
        ProductOnSale pos129 = this.service.createProductOnSale(product028, provider008, 97293.0F,
                sdf.parse("4/4/2020"));
        ProductOnSale pos130 = this.service.createProductOnSale(product028, provider008, 116751.0F,
                sdf.parse("23/7/2020"));
        ProductOnSale pos131 = this.service.createProductOnSale(product028, provider008, 127258.0F,
                sdf.parse("4/11/2020"));
        ProductOnSale pos132 = this.service.createProductOnSale(product066, provider018, 99363.0F,
                sdf.parse("11/4/2019"));
        ProductOnSale pos133 = this.service.createProductOnSale(product066, provider018, 118241.0F,
                sdf.parse("4/8/2019"));
        ProductOnSale pos134 = this.service.createProductOnSale(product066, provider018, 138341.0F,
                sdf.parse("4/10/2019"));
        ProductOnSale pos135 = this.service.createProductOnSale(product068, provider018, 79094.0F,
                sdf.parse("23/12/2019"));
        ProductOnSale pos136 = this.service.createProductOnSale(product068, provider018, 86212.0F,
                sdf.parse("29/3/2020"));
        ProductOnSale pos137 = this.service.createProductOnSale(product038, provider009, 8607.0F,
                sdf.parse("18/1/2019"));
        ProductOnSale pos138 = this.service.createProductOnSale(product048, provider016, 90414.0F,
                sdf.parse("8/7/2019"));
        ProductOnSale pos139 = this.service.createProductOnSale(product010, provider010, 94641.0F,
                sdf.parse("4/10/2019"));
        ProductOnSale pos140 = this.service.createProductOnSale(product010, provider010, 111676.0F,
                sdf.parse("9/1/2020"));
        ProductOnSale pos141 = this.service.createProductOnSale(product010, provider010, 144062.0F,
                sdf.parse("23/3/2020"));
        ProductOnSale pos142 = this.service.createProductOnSale(product003, provider017, 79720.0F,
                sdf.parse("22/4/2019"));
        ProductOnSale pos143 = this.service.createProductOnSale(product060, provider008, 2258.0F,
                sdf.parse("20/7/2019"));
        ProductOnSale pos144 = this.service.createProductOnSale(product021, provider011, 55179.0F,
                sdf.parse("20/5/2020"));
        ProductOnSale pos145 = this.service.createProductOnSale(product021, provider011, 74491.0F,
                sdf.parse("16/9/2020"));
        ProductOnSale pos146 = this.service.createProductOnSale(product021, provider011, 81940.0F,
                sdf.parse("26/11/2020"));
        ProductOnSale pos147 = this.service.createProductOnSale(product061, provider013, 85361.0F,
                sdf.parse("13/6/2019"));
        ProductOnSale pos148 = this.service.createProductOnSale(product029, provider009, 2598.0F,
                sdf.parse("27/8/2019"));
        ProductOnSale pos149 = this.service.createProductOnSale(product022, provider012, 3004.0F,
                sdf.parse("14/10/2020"));
        ProductOnSale pos150 = this.service.createProductOnSale(product022, provider012, 3574.0F,
                sdf.parse("30/1/2021"));
        ProductOnSale pos151 = this.service.createProductOnSale(product022, provider012, 3824.0F,
                sdf.parse("16/4/2021"));
        ProductOnSale pos152 = this.service.createProductOnSale(product074, provider016, 8126.0F,
                sdf.parse("20/3/2020"));
        ProductOnSale pos153 = this.service.createProductOnSale(product074, provider016, 10482.0F,
                sdf.parse("16/6/2020"));
        ProductOnSale pos154 = this.service.createProductOnSale(product080, provider015, 54408.0F,
                sdf.parse("16/3/2019"));
        ProductOnSale pos155 = this.service.createProductOnSale(product063, provider001, 57729.0F,
                sdf.parse("28/10/2019"));
        ProductOnSale pos156 = this.service.createProductOnSale(product063, provider001, 71006.0F,
                sdf.parse("1/1/2020"));
        ProductOnSale pos157 = this.service.createProductOnSale(product063, provider001, 87337.0F,
                sdf.parse("26/4/2020"));
        ProductOnSale pos158 = this.service.createProductOnSale(product074, provider013, 49754.0F,
                sdf.parse("20/4/2019"));
        ProductOnSale pos159 = this.service.createProductOnSale(product065, provider015, 32212.0F,
                sdf.parse("27/11/2020"));
        ProductOnSale pos160 = this.service.createProductOnSale(product065, provider015, 42519.0F,
                sdf.parse("24/2/2021"));
        ProductOnSale pos161 = this.service.createProductOnSale(product072, provider006, 25002.0F,
                sdf.parse("5/1/2019"));
        ProductOnSale pos162 = this.service.createProductOnSale(product052, provider011, 17726.0F,
                sdf.parse("28/1/2020"));
        ProductOnSale pos163 = this.service.createProductOnSale(product052, provider011, 22866.0F,
                sdf.parse("18/4/2020"));
        ProductOnSale pos164 = this.service.createProductOnSale(product001, provider002, 67179.0F,
                sdf.parse("12/9/2020"));
        ProductOnSale pos165 = this.service.createProductOnSale(product001, provider002, 71209.0F,
                sdf.parse("15/12/2020"));
        ProductOnSale pos166 = this.service.createProductOnSale(product001, provider002, 94707.0F,
                sdf.parse("12/4/2021"));
        ProductOnSale pos167 = this.service.createProductOnSale(product062, provider003, 85597.0F,
                sdf.parse("28/10/2019"));
        ProductOnSale pos168 = this.service.createProductOnSale(product062, provider003, 101004.0F,
                sdf.parse("21/1/2020"));
        ProductOnSale pos169 = this.service.createProductOnSale(product062, provider003, 109084.0F,
                sdf.parse("6/5/2020"));
        ProductOnSale pos170 = this.service.createProductOnSale(product036, provider003, 9879.0F,
                sdf.parse("4/11/2019"));
        ProductOnSale pos171 = this.service.createProductOnSale(product036, provider003, 11262.0F,
                sdf.parse("10/2/2020"));
        ProductOnSale pos172 = this.service.createProductOnSale(product036, provider003, 12951.0F,
                sdf.parse("4/5/2020"));
        ProductOnSale pos173 = this.service.createProductOnSale(product032, provider011, 67258.0F,
                sdf.parse("14/4/2019"));
        ProductOnSale pos174 = this.service.createProductOnSale(product032, provider011, 81382.0F,
                sdf.parse("6/8/2019"));
        ProductOnSale pos175 = this.service.createProductOnSale(product018, provider004, 11745.0F,
                sdf.parse("19/6/2019"));
        ProductOnSale pos176 = this.service.createProductOnSale(product018, provider004, 13271.0F,
                sdf.parse("12/10/2019"));
        ProductOnSale pos177 = this.service.createProductOnSale(product018, provider004, 17385.0F,
                sdf.parse("3/1/2020"));
        ProductOnSale pos178 = this.service.createProductOnSale(product044, provider017, 6669.0F,
                sdf.parse("2/2/2020"));
        ProductOnSale pos179 = this.service.createProductOnSale(product018, provider012, 46587.0F,
                sdf.parse("15/8/2020"));
        ProductOnSale pos180 = this.service.createProductOnSale(product018, provider012, 57767.0F,
                sdf.parse("13/12/2020"));
        ProductOnSale pos181 = this.service.createProductOnSale(product018, provider012, 71631.0F,
                sdf.parse("25/2/2021"));
        ProductOnSale pos182 = this.service.createProductOnSale(product033, provider001, 59918.0F,
                sdf.parse("24/12/2019"));
        ProductOnSale pos183 = this.service.createProductOnSale(product023, provider016, 80575.0F,
                sdf.parse("20/6/2019"));
        ProductOnSale pos184 = this.service.createProductOnSale(product023, provider016, 106359.0F,
                sdf.parse("15/9/2019"));
        ProductOnSale pos185 = this.service.createProductOnSale(product009, provider004, 72899.0F,
                sdf.parse("9/3/2019"));
        ProductOnSale pos186 = this.service.createProductOnSale(product064, provider008, 87977.0F,
                sdf.parse("17/3/2019"));
        ProductOnSale pos187 = this.service.createProductOnSale(product064, provider008, 110851.0F,
                sdf.parse("28/5/2019"));
        ProductOnSale pos188 = this.service.createProductOnSale(product064, provider008, 130804.0F,
                sdf.parse("15/9/2019"));
        ProductOnSale pos189 = this.service.createProductOnSale(product038, provider014, 47219.0F,
                sdf.parse("9/2/2019"));
        ProductOnSale pos190 = this.service.createProductOnSale(product059, provider007, 7454.0F,
                sdf.parse("10/4/2019"));
        ProductOnSale pos191 = this.service.createProductOnSale(product059, provider007, 8646.0F,
                sdf.parse("3/7/2019"));
        ProductOnSale pos192 = this.service.createProductOnSale(product067, provider006, 37437.0F,
                sdf.parse("17/8/2020"));
        ProductOnSale pos193 = this.service.createProductOnSale(product067, provider006, 50165.0F,
                sdf.parse("22/10/2020"));
        ProductOnSale pos194 = this.service.createProductOnSale(product067, provider006, 63207.0F,
                sdf.parse("16/2/2021"));
        ProductOnSale pos195 = this.service.createProductOnSale(product061, provider017, 52204.0F,
                sdf.parse("10/5/2020"));
        ProductOnSale pos196 = this.service.createProductOnSale(product040, provider014, 99190.0F,
                sdf.parse("10/3/2020"));
        ProductOnSale pos197 = this.service.createProductOnSale(product019, provider017, 55122.0F,
                sdf.parse("9/12/2020"));
        ProductOnSale pos198 = this.service.createProductOnSale(product019, provider017, 73312.0F,
                sdf.parse("31/3/2021"));
        ProductOnSale pos199 = this.service.createProductOnSale(product019, provider017, 86508.0F,
                sdf.parse("1/7/2021"));
        ProductOnSale pos200 = this.service.createProductOnSale(product046, provider016, 96110.0F,
                sdf.parse("16/11/2019"));
        ProductOnSale pos201 = this.service.createProductOnSale(product020, provider017, 71981.0F,
                sdf.parse("9/5/2020"));
        ProductOnSale pos202 = this.service.createProductOnSale(product020, provider017, 84937.0F,
                sdf.parse("7/8/2020"));
        ProductOnSale pos203 = this.service.createProductOnSale(product020, provider017, 92581.0F,
                sdf.parse("31/10/2020"));
        ProductOnSale pos204 = this.service.createProductOnSale(product056, provider007, 26892.0F,
                sdf.parse("5/3/2020"));
        ProductOnSale pos205 = this.service.createProductOnSale(product056, provider007, 35766.0F,
                sdf.parse("15/6/2020"));
        ProductOnSale pos206 = this.service.createProductOnSale(product056, provider007, 42203.0F,
                sdf.parse("23/8/2020"));

        DeliveryMethod delivery01 = this.service.createDeliveryMethod("Moto menos 1kg", 250.0F, 0.01F, 999F);
        DeliveryMethod delivery02 = this.service.createDeliveryMethod("Moto menos 1kg - inmediato", 450.0F, 0.01F,
                999F);
        DeliveryMethod delivery03 = this.service.createDeliveryMethod("Courier hasta 5kg", 400.0F, 0.01F, 5000F);
        DeliveryMethod delivery04 = this.service.createDeliveryMethod("Courier hasta 5kg - inmediato", 1000.0F, 0.01F,
                5000F);
        DeliveryMethod delivery05 = this.service.createDeliveryMethod("Courier hasta 5kg - prioritario", 2000.0F, 0.01F,
                5000F);
        DeliveryMethod delivery06 = this.service.createDeliveryMethod("Flete", 400.0F, 5000.0F, 500000.0F);
        DeliveryMethod delivery07 = this.service.createDeliveryMethod("Flete - inmediato", 1000.0F, 5000.0F, 500000.0F);
        DeliveryMethod delivery08 = this.service.createDeliveryMethod("Flete - prioritario", 2000.0F, 5000.0F,
                500000.0F);
        CreditCardPayment purchase001_payment = this.service.createCreditCardPayment("Visa Paula Gallardo", "Visa",
                184566595212L, sdf.parse("13/3/2025"), 11, "Paula Gallardo");
        this.service.createPurchase(pos049, 2, user010, delivery05, purchase001_payment, "Calle 52 Nº1638", -34.910215F,
                -57.959533F, sdf.parse("1/3/2020"));
        OnDeliveryPayment purchase002_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos063", 568660.0F);
        this.service.createPurchase(pos063, 9, user032, delivery06, purchase002_payment, "Calle 38 Nº1897", -34.933699F,
                -57.924093F, sdf.parse("20/3/2021"));
        OnDeliveryPayment purchase003_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos001", 380200.0F);
        this.service.createPurchase(pos001, 4, user008, delivery08, purchase003_payment, "Calle 56 Nº422", -34.926278F,
                -57.989829F, sdf.parse("28/2/2020"));
        OnDeliveryPayment purchase004_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos100", 76914.0F);
        this.service.createPurchase(pos100, 7, user071, delivery08, purchase004_payment, "Calle 33 Nº147", -34.915006F,
                -57.968775F, sdf.parse("19/4/2019"));
        CreditCardPayment purchase005_payment = this.service.createCreditCardPayment("Visa Florencia Arias", "Visa",
                980735141775L, sdf.parse("2/5/2022"), 216, "Florencia Arias");
        this.service.createPurchase(pos008, 2, user004, delivery08, purchase005_payment, "Calle 52 Nº1377", -34.925899F,
                -57.982532F, sdf.parse("24/3/2020"));
        OnDeliveryPayment purchase006_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos083", 317779.0F);
        this.service.createPurchase(pos083, 3, user099, delivery07, purchase006_payment, "Calle 54 Nº1301", -34.931078F,
                -57.95721F, sdf.parse("1/4/2020"));
        OnDeliveryPayment purchase007_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos092", 85541.0F);
        this.service.createPurchase(pos092, 1, user040, delivery07, purchase007_payment, "Calle 54 Nº1370", -34.911131F,
                -57.921511F, sdf.parse("30/1/2020"));
        CreditCardPayment purchase008_payment = this.service.createCreditCardPayment("Amex Selene Calvo", "Amex",
                906826774546L, sdf.parse("14/11/2025"), 38, "Selene Calvo");
        this.service.createPurchase(pos029, 7, user077, delivery06, purchase008_payment, "Calle 37 Nº1732", -34.928352F,
                -57.937469F, sdf.parse("5/12/2019"));
        OnDeliveryPayment purchase009_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos076", 172810.0F);
        this.service.createPurchase(pos076, 2, user042, delivery04, purchase009_payment, "Calle 36 Nº1656", -34.933777F,
                -57.915988F, sdf.parse("10/5/2021"));
        CreditCardPayment purchase010_payment = this.service.createCreditCardPayment("Visa Carlos Pascual", "Visa",
                383241897162L, sdf.parse("3/5/2022"), 147, "Carlos Pascual");
        this.service.createPurchase(pos084, 7, user085, delivery06, purchase010_payment, "Calle 70 Nº1257", -34.937257F,
                -57.933088F, sdf.parse("7/7/2020"));
        OnDeliveryPayment purchase011_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos043", 74298.0F);
        this.service.createPurchase(pos043, 2, user058, delivery05, purchase011_payment, "Calle 38 Nº1926", -34.942863F,
                -57.917931F, sdf.parse("6/4/2019"));
        CreditCardPayment purchase012_payment = this.service.createCreditCardPayment("MasterCard Beatriz Román",
                "MasterCard", 337766392314L, sdf.parse("28/2/2024"), 839, "Beatriz Román");
        this.service.createPurchase(pos080, 7, user102, delivery07, purchase012_payment, "Calle 71 Nº123", -34.922762F,
                -57.973945F, sdf.parse("27/9/2020"));
        CreditCardPayment purchase013_payment = this.service.createCreditCardPayment("MasterCard Silvia Sáez",
                "MasterCard", 463038870349L, sdf.parse("22/10/2021"), 294, "Silvia Sáez");
        this.service.createPurchase(pos074, 1, user093, delivery04, purchase013_payment, "Calle 40 Nº1696", -34.918675F,
                -57.948488F, sdf.parse("3/12/2020"));
        OnDeliveryPayment purchase014_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos096", 97700.0F);
        this.service.createPurchase(pos096, 4, user096, delivery07, purchase014_payment, "Calle 49 Nº1481", -34.925281F,
                -57.955979F, sdf.parse("30/10/2020"));
        CreditCardPayment purchase015_payment = this.service.createCreditCardPayment("Visa Santiago Serrano", "Visa",
                918652579616L, sdf.parse("6/5/2021"), 794, "Santiago Serrano");
        this.service.createPurchase(pos071, 6, user099, delivery08, purchase015_payment, "Calle 72 Nº1816", -34.914994F,
                -57.988997F, sdf.parse("1/7/2019"));
        OnDeliveryPayment purchase016_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos029", 181200.0F);
        this.service.createPurchase(pos029, 9, user075, delivery07, purchase016_payment, "Calle 56 Nº1582", -34.921639F,
                -57.924697F, sdf.parse("17/1/2020"));
        OnDeliveryPayment purchase017_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos028", 62668.0F);
        this.service.createPurchase(pos028, 4, user096, delivery08, purchase017_payment, "Calle 66 Nº1979", -34.932614F,
                -57.992934F, sdf.parse("3/9/2019"));
        OnDeliveryPayment purchase018_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos076b",
                861100.0F);
        this.service.createPurchase(pos076, 10, user077, delivery08, purchase018_payment, "Calle 33 Nº615", -34.912899F,
                -57.942329F, sdf.parse("13/5/2021"));
        CreditCardPayment purchase019_payment = this.service.createCreditCardPayment("Amex Norberto Ibáñez", "Amex",
                921549843122L, sdf.parse("15/3/2023"), 488, "Norberto Ibáñez");
        this.service.createPurchase(pos058, 9, user109, delivery05, purchase019_payment, "Calle 70 Nº649", -34.908585F,
                -57.985825F, sdf.parse("6/12/2020"));
        OnDeliveryPayment purchase020_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos049", 129814.0F);
        this.service.createPurchase(pos049, 7, user107, delivery07, purchase020_payment, "Calle 55 Nº1901", -34.914235F,
                -57.960916F, sdf.parse("20/3/2020"));
        CreditCardPayment purchase021_payment = this.service.createCreditCardPayment("Visa Selene Carmona", "Visa",
                111386091501L, sdf.parse("12/7/2025"), 66, "Selene Carmona");
        this.service.createPurchase(pos089, 2, user082, delivery07, purchase021_payment, "Calle 63 Nº521", -34.936069F,
                -57.976261F, sdf.parse("24/4/2019"));
        OnDeliveryPayment purchase022_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos008", 535200.0F);
        this.service.createPurchase(pos008, 10, user057, delivery08, purchase022_payment, "Calle 62 Nº876", -34.927654F,
                -57.961338F, sdf.parse("1/5/2020"));
        OnDeliveryPayment purchase023_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos012", 605600.0F);
        this.service.createPurchase(pos012, 7, user107, delivery06, purchase023_payment, "Calle 63 Nº1121", -34.922892F,
                -57.969627F, sdf.parse("11/12/2019"));
        OnDeliveryPayment purchase024_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos056", 242389.0F);
        this.service.createPurchase(pos056, 3, user007, delivery06, purchase024_payment, "Calle 58 Nº1606", -34.924083F,
                -57.944338F, sdf.parse("18/3/2020"));
        OnDeliveryPayment purchase025_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos074", 356800.0F);
        this.service.createPurchase(pos074, 6, user022, delivery07, purchase025_payment, "Calle 47 Nº1654", -34.938082F,
                -57.918054F, sdf.parse("12/11/2020"));
        CreditCardPayment purchase026_payment = this.service.createCreditCardPayment("MasterCard Ana Muñoz",
                "MasterCard", 677254373523L, sdf.parse("2/8/2024"), 614, "Ana Muñoz");
        this.service.createPurchase(pos013, 10, user027, delivery08, purchase026_payment, "Calle 50 Nº41", -34.945763F,
                -57.964966F, sdf.parse("17/12/2020"));
        OnDeliveryPayment purchase027_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos087", 446328.0F);
        this.service.createPurchase(pos087, 7, user071, delivery06, purchase027_payment, "Calle 44 Nº1537", -34.934522F,
                -57.99001F, sdf.parse("8/10/2019"));
        CreditCardPayment purchase028_payment = this.service.createCreditCardPayment("Amex Paula Morales", "Amex",
                747832033666L, sdf.parse("23/1/2025"), 813, "Paula Morales");
        this.service.createPurchase(pos049, 3, user029, delivery05, purchase028_payment, "Calle 64 Nº1372", -34.910344F,
                -57.927016F, sdf.parse("30/3/2020"));
        CreditCardPayment purchase029_payment = this.service.createCreditCardPayment("MasterCard Ana Rubio",
                "MasterCard", 518081428259L, sdf.parse("3/5/2023"), 395, "Ana Rubio");
        this.service.createPurchase(pos003, 7, user040, delivery04, purchase029_payment, "Calle 47 Nº578", -34.946091F,
                -57.924105F, sdf.parse("24/9/2019"));
        OnDeliveryPayment purchase030_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos034", 88276.0F);
        this.service.createPurchase(pos034, 4, user073, delivery08, purchase030_payment, "Calle 68 Nº1552", -34.942479F,
                -57.928834F, sdf.parse("11/9/2020"));
        CreditCardPayment purchase031_payment = this.service.createCreditCardPayment("Visa Carlos Benítez", "Visa",
                852264261735L, sdf.parse("16/7/2023"), 6, "Carlos Benítez");
        this.service.createPurchase(pos078, 3, user091, delivery06, purchase031_payment, "Calle 56 Nº405", -34.937438F,
                -57.946413F, sdf.parse("12/3/2020"));
        CreditCardPayment purchase032_payment = this.service.createCreditCardPayment("Amex Sonia Gutiérrez", "Amex",
                811400096310L, sdf.parse("27/7/2022"), 202, "Sonia Gutiérrez");
        this.service.createPurchase(pos045, 2, user023, delivery06, purchase032_payment, "Calle 47 Nº1864", -34.913038F,
                -57.975673F, sdf.parse("18/10/2019"));
        CreditCardPayment purchase033_payment = this.service.createCreditCardPayment("MasterCard Paula Moya",
                "MasterCard", 502771204572L, sdf.parse("11/10/2022"), 76, "Paula Moya");
        this.service.createPurchase(pos094, 7, user056, delivery08, purchase033_payment, "Calle 57 Nº1984", -34.948053F,
                -57.949044F, sdf.parse("19/9/2020"));
        OnDeliveryPayment purchase034_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos055", 343940.0F);
        this.service.createPurchase(pos055, 6, user093, delivery08, purchase034_payment, "Calle 51 Nº1488", -34.946963F,
                -57.970727000000004F, sdf.parse("26/2/2020"));
        CreditCardPayment purchase035_payment = this.service.createCreditCardPayment("Visa Natalio Gil", "Visa",
                618987320279L, sdf.parse("14/6/2023"), 320, "Natalio Gil");
        this.service.createPurchase(pos064, 9, user046, delivery07, purchase035_payment, "Calle 41 Nº1470", -34.933901F,
                -57.957777F, sdf.parse("17/10/2019"));
        OnDeliveryPayment purchase036_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos080", 85100.0F);
        this.service.createPurchase(pos080, 8, user076, delivery06, purchase036_payment, "Calle 67 Nº1890", -34.925836F,
                -57.983171F, sdf.parse("2/9/2020"));
        CreditCardPayment purchase037_payment = this.service.createCreditCardPayment("Visa Florencia Serrano", "Visa",
                175437231164L, sdf.parse("6/12/2023"), 573, "Florencia Serrano");
        this.service.createPurchase(pos066, 5, user034, delivery07, purchase037_payment, "Calle 57 Nº1182", -34.92746F,
                -57.937386000000004F, sdf.parse("30/6/2020"));
        CreditCardPayment purchase038_payment = this.service.createCreditCardPayment("MasterCard Sonia Gutiérrez",
                "MasterCard", 762116306350L, sdf.parse("17/2/2023"), 888, "Sonia Gutiérrez");
        this.service.createPurchase(pos004, 4, user023, delivery04, purchase038_payment, "Calle 65 Nº1346", -34.933399F,
                -57.955987F, sdf.parse("1/3/2020"));
        CreditCardPayment purchase039_payment = this.service.createCreditCardPayment("Amex María Calvo", "Amex",
                243069438843L, sdf.parse("7/9/2022"), 268, "María Calvo");
        this.service.createPurchase(pos006, 8, user030, delivery05, purchase039_payment, "Calle 32 Nº856", -34.912299F,
                -57.98189F, sdf.parse("22/3/2021"));
        CreditCardPayment purchase040_payment = this.service.createCreditCardPayment("Amex Luz Muñoz", "Amex",
                91128320942L, sdf.parse("22/8/2021"), 594, "Luz Muñoz");
        this.service.createPurchase(pos029, 1, user092, delivery08, purchase040_payment, "Calle 60 Nº908", -34.918306F,
                -57.932999F, sdf.parse("12/11/2019"));
        OnDeliveryPayment purchase041_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos061", 261400.0F);
        this.service.createPurchase(pos061, 6, user010, delivery06, purchase041_payment, "Calle 72 Nº1472", -34.942234F,
                -57.952236F, sdf.parse("11/10/2020"));
        CreditCardPayment purchase042_payment = this.service.createCreditCardPayment("MasterCard Sonia Blanco",
                "MasterCard", 164364791552L, sdf.parse("2/1/2023"), 479, "Sonia Blanco");
        this.service.createPurchase(pos001, 4, user062, delivery06, purchase042_payment, "Calle 61 Nº422", -34.919136F,
                -57.974302F, sdf.parse("29/1/2020"));
        OnDeliveryPayment purchase043_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos052", 668546.0F);
        this.service.createPurchase(pos052, 6, user053, delivery08, purchase043_payment, "Calle 61 Nº704", -34.925614F,
                -57.989074F, sdf.parse("1/8/2020"));
        CreditCardPayment purchase044_payment = this.service.createCreditCardPayment("Amex Ana Rubio", "Amex",
                217553373062L, sdf.parse("3/9/2022"), 420, "Ana Rubio");
        this.service.createPurchase(pos002, 6, user040, delivery07, purchase044_payment, "Calle 43 Nº1939", -34.907977F,
                -57.937203F, sdf.parse("20/3/2020"));
        CreditCardPayment purchase045_payment = this.service.createCreditCardPayment("MasterCard Ana Muñoz 2",
                "MasterCard", 406494302865L, sdf.parse("18/3/2023"), 949, "Ana Muñoz");
        this.service.createPurchase(pos086, 5, user027, delivery08, purchase045_payment, "Calle 40 Nº137", -34.934211F,
                -57.925407F, sdf.parse("26/6/2020"));
        CreditCardPayment purchase046_payment = this.service.createCreditCardPayment("MasterCard María Calvo",
                "MasterCard", 654998459692L, sdf.parse("25/6/2025"), 559, "María Calvo");
        this.service.createPurchase(pos091, 6, user030, delivery07, purchase046_payment, "Calle 68 Nº1414", -34.924609F,
                -57.945084F, sdf.parse("14/10/2019"));
        OnDeliveryPayment purchase047_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos066", 265201.0F);
        this.service.createPurchase(pos066, 7, user106, delivery07, purchase047_payment, "Calle 38 Nº1724", -34.942338F,
                -57.941365F, sdf.parse("11/4/2020"));
        OnDeliveryPayment purchase048_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos045b",
                219700.0F);
        this.service.createPurchase(pos045, 4, user005, delivery06, purchase048_payment, "Calle 35 Nº20", -34.942647F,
                -57.945638F, sdf.parse("1/11/2019"));
        CreditCardPayment purchase049_payment = this.service.createCreditCardPayment("Visa Carlos Herrero", "Visa",
                987277247005L, sdf.parse("4/12/2021"), 169, "Carlos Herrero");
        this.service.createPurchase(pos003, 1, user021, delivery01, purchase049_payment, "Calle 37 Nº1025", -34.932285F,
                -57.927949F, sdf.parse("25/10/2019"));
        CreditCardPayment purchase050_payment = this.service.createCreditCardPayment("MasterCard Matias García",
                "MasterCard", 895364906124L, sdf.parse("25/4/2025"), 398, "Matias García");
        this.service.createPurchase(pos006, 6, user083, delivery04, purchase050_payment, "Calle 48 Nº900", -34.925818F,
                -57.986403F, sdf.parse("13/4/2021"));
        OnDeliveryPayment purchase051_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos051", 599185.0F);
        this.service.createPurchase(pos051, 7, user099, delivery07, purchase051_payment, "Calle 48 Nº1811", -34.940105F,
                -57.989369F, sdf.parse("30/5/2020"));
        CreditCardPayment purchase052_payment = this.service.createCreditCardPayment("MasterCard Carlos Pascual",
                "MasterCard", 700287072780L, sdf.parse("4/10/2022"), 725, "Carlos Pascual");
        this.service.createPurchase(pos087, 5, user085, delivery06, purchase052_payment, "Calle 42 Nº116", -34.909122F,
                -57.950309F, sdf.parse("8/9/2019"));
        OnDeliveryPayment purchase053_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos094", 387000.0F);
        this.service.createPurchase(pos094, 4, user048, delivery06, purchase053_payment, "Calle 40 Nº868", -34.935076F,
                -57.977616F, sdf.parse("29/7/2020"));
        OnDeliveryPayment purchase054_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos019", 149191.0F);
        this.service.createPurchase(pos019, 3, user039, delivery07, purchase054_payment, "Calle 33 Nº1494", -34.94471F,
                -57.965644F, sdf.parse("12/7/2019"));
        OnDeliveryPayment purchase055_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos037", 161456.0F);
        this.service.createPurchase(pos037, 2, user064, delivery04, purchase055_payment, "Calle 33 Nº1295", -34.924994F,
                -57.986147F, sdf.parse("4/6/2020"));
        OnDeliveryPayment purchase056_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos088", 545704.0F);
        this.service.createPurchase(pos088, 8, user096, delivery06, purchase056_payment, "Calle 39 Nº1870", -34.941946F,
                -57.936681F, sdf.parse("5/12/2019"));
        CreditCardPayment purchase057_payment = this.service.createCreditCardPayment("Amex Rubén Cruz", "Amex",
                241419334543L, sdf.parse("14/10/2024"), 535, "Rubén Cruz");
        this.service.createPurchase(pos049, 5, user050, delivery06, purchase057_payment, "Calle 47 Nº886", -34.912408F,
                -57.959708F, sdf.parse("31/3/2020"));
        CreditCardPayment purchase058_payment = this.service.createCreditCardPayment("Visa Sonia Carmona", "Visa",
                14019712813L, sdf.parse("7/1/2025"), 629, "Sonia Carmona");
        this.service.createPurchase(pos006, 6, user057, delivery05, purchase058_payment, "Calle 72 Nº307", -34.921041F,
                -57.949992F, sdf.parse("28/2/2021"));
        OnDeliveryPayment purchase059_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos094b", 97100.0F);
        this.service.createPurchase(pos094, 1, user081, delivery03, purchase059_payment, "Calle 44 Nº1148", -34.926546F,
                -57.95055F, sdf.parse("26/7/2020"));
        OnDeliveryPayment purchase060_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos091", 711430.0F);
        this.service.createPurchase(pos091, 10, user017, delivery07, purchase060_payment, "Calle 58 Nº1686",
                -34.928062F, -57.953946F, sdf.parse("26/9/2019"));
        CreditCardPayment purchase061_payment = this.service.createCreditCardPayment("Amex Silvia Sáez", "Amex",
                831325967252L, sdf.parse("5/6/2023"), 96, "Silvia Sáez");
        this.service.createPurchase(pos015, 4, user059, delivery05, purchase061_payment, "Calle 52 Nº1470", -34.937306F,
                -57.925418F, sdf.parse("13/9/2021"));
        OnDeliveryPayment purchase062_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos068", 383460.0F);
        this.service.createPurchase(pos068, 4, user048, delivery05, purchase062_payment, "Calle 60 Nº179", -34.931685F,
                -57.948836F, sdf.parse("7/8/2019"));
        OnDeliveryPayment purchase063_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos054", 322120.0F);
        this.service.createPurchase(pos054, 7, user039, delivery06, purchase063_payment, "Calle 65 Nº1231", -34.933939F,
                -57.983105F, sdf.parse("27/11/2019"));
        CreditCardPayment purchase064_payment = this.service.createCreditCardPayment("MasterCard Matias Campos",
                "MasterCard", 820666991556L, sdf.parse("19/10/2024"), 950, "Matias Campos");
        this.service.createPurchase(pos068, 8, user097, delivery07, purchase064_payment, "Calle 72 Nº1198", -34.940661F,
                -57.959622F, sdf.parse("30/9/2019"));
        OnDeliveryPayment purchase065_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos033", 172840.0F);
        this.service.createPurchase(pos033, 6, user016, delivery06, purchase065_payment, "Calle 59 Nº547", -34.934876F,
                -57.960247F, sdf.parse("19/7/2019"));
        CreditCardPayment purchase066_payment = this.service.createCreditCardPayment("Amex Mariana Serrano", "Amex",
                489487811220L, sdf.parse("10/8/2022"), 821, "Mariana Serrano");
        this.service.createPurchase(pos024, 8, user053, delivery06, purchase066_payment, "Calle 46 Nº771", -34.933159F,
                -57.946186F, sdf.parse("29/8/2020"));
        CreditCardPayment purchase067_payment = this.service.createCreditCardPayment("Amex Juan Hernández", "Amex",
                843886247763L, sdf.parse("23/7/2025"), 196, "Juan Hernández");
        this.service.createPurchase(pos014, 2, user104, delivery03, purchase067_payment, "Calle 72 Nº54", -34.938558F,
                -57.932095F, sdf.parse("20/5/2021"));
        CreditCardPayment purchase068_payment = this.service.createCreditCardPayment("MasterCard Matias Herrero",
                "MasterCard", 754850678031L, sdf.parse("2/10/2022"), 775, "Matias Herrero");
        this.service.createPurchase(pos007, 2, user075, delivery01, purchase068_payment, "Calle 51 Nº177", -34.916878F,
                -57.971091F, sdf.parse("14/6/2021"));
        OnDeliveryPayment purchase069_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos094c",
                775100.0F);
        this.service.createPurchase(pos094, 8, user017, delivery08, purchase069_payment, "Calle 62 Nº875", -34.948131F,
                -57.93801F, sdf.parse("5/10/2020"));
        CreditCardPayment purchase070_payment = this.service.createCreditCardPayment("MasterCard Luz Montero",
                "MasterCard", 199450179096L, sdf.parse("28/9/2021"), 160, "Luz Montero");
        this.service.createPurchase(pos003, 9, user067, delivery08, purchase070_payment, "Calle 48 Nº1489", -34.917537F,
                -57.992789F, sdf.parse("7/11/2019"));
        CreditCardPayment purchase071_payment = this.service.createCreditCardPayment("Visa Selene Giménez", "Visa",
                309817451197L, sdf.parse("20/10/2024"), 102, "Selene Giménez");
        this.service.createPurchase(pos006, 6, user086, delivery04, purchase071_payment, "Calle 65 Nº366", -34.937996F,
                -57.915631F, sdf.parse("17/4/2021"));
        CreditCardPayment purchase072_payment = this.service.createCreditCardPayment("Visa Rubén Pastor", "Visa",
                142653539844L, sdf.parse("11/11/2021"), 578, "Rubén Pastor");
        this.service.createPurchase(pos070, 1, user028, delivery05, purchase072_payment, "Calle 49 Nº1547", -34.935205F,
                -57.948086F, sdf.parse("29/4/2019"));
        OnDeliveryPayment purchase073_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos066b",
                228500.0F);
        this.service.createPurchase(pos066, 6, user079, delivery08, purchase073_payment, "Calle 48 Nº176", -34.941097F,
                -57.939597F, sdf.parse("28/5/2020"));
        OnDeliveryPayment purchase074_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos088b",
                205500.0F);
        this.service.createPurchase(pos088, 3, user090, delivery07, purchase074_payment, "Calle 51 Nº399", -34.944125F,
                -57.983453F, sdf.parse("10/1/2020"));
        OnDeliveryPayment purchase075_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos031", 513072.0F);
        this.service.createPurchase(pos031, 8, user045, delivery04, purchase075_payment, "Calle 40 Nº990", -34.93282F,
                -57.973831F, sdf.parse("28/3/2020"));
        OnDeliveryPayment purchase076_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos053", 874200.0F);
        this.service.createPurchase(pos053, 6, user074, delivery07, purchase076_payment, "Calle 43 Nº1643", -34.905367F,
                -57.923359F, sdf.parse("4/11/2020"));
        CreditCardPayment purchase077_payment = this.service.createCreditCardPayment("Visa Silvia Sáez", "Visa",
                318367860894L, sdf.parse("14/9/2024"), 808, "Silvia Sáez");
        this.service.createPurchase(pos010, 9, user093, delivery06, purchase077_payment, "Calle 66 Nº150", -34.925502F,
                -57.923734F, sdf.parse("7/11/2019"));
        OnDeliveryPayment purchase078_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos008b",
                320300.0F);
        this.service.createPurchase(pos008, 6, user061, delivery06, purchase078_payment, "Calle 62 Nº1969", -34.93175F,
                -57.955398F, sdf.parse("1/4/2020"));
        OnDeliveryPayment purchase079_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos069", 938800.0F);
        this.service.createPurchase(pos069, 8, user083, delivery06, purchase079_payment, "Calle 36 Nº1616", -34.934993F,
                -57.930404F, sdf.parse("27/12/2019"));
        OnDeliveryPayment purchase080_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos031b",
                576500.0F);
        this.service.createPurchase(pos031, 9, user075, delivery06, purchase080_payment, "Calle 51 Nº305", -34.931706F,
                -57.956426F, sdf.parse("25/4/2020"));
        CreditCardPayment purchase081_payment = this.service.createCreditCardPayment("MasterCard Mariana Cano",
                "MasterCard", 748955528135L, sdf.parse("16/5/2022"), 695, "Mariana Cano");
        this.service.createPurchase(pos058, 3, user068, delivery02, purchase081_payment, "Calle 54 Nº1146", -34.936778F,
                -57.932774F, sdf.parse("31/10/2020"));
        OnDeliveryPayment purchase082_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos012b",
                173900.0F);
        this.service.createPurchase(pos012, 2, user107, delivery07, purchase082_payment, "Calle 51 Nº599", -34.916013F,
                -57.97187F, sdf.parse("29/11/2019"));
        OnDeliveryPayment purchase083_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos017", 224100.0F);
        this.service.createPurchase(pos017, 7, user043, delivery07, purchase083_payment, "Calle 40 Nº816", -34.939137F,
                -57.949361F, sdf.parse("26/2/2020"));
        OnDeliveryPayment purchase084_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos002", 901100.0F);
        this.service.createPurchase(pos002, 8, user036, delivery07, purchase084_payment, "Calle 44 Nº106", -34.923168F,
                -57.914926F, sdf.parse("22/4/2020"));
        OnDeliveryPayment purchase085_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos006", 347300.0F);
        this.service.createPurchase(pos006, 3, user093, delivery05, purchase085_payment, "Calle 44 Nº1462", -34.925027F,
                -57.95876F, sdf.parse("31/3/2021"));
        OnDeliveryPayment purchase086_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos072", 459200.0F);
        this.service.createPurchase(pos072, 4, user108, delivery06, purchase086_payment, "Calle 52 Nº996", -34.906816F,
                -57.948057F, sdf.parse("26/10/2019"));
        CreditCardPayment purchase087_payment = this.service.createCreditCardPayment("MasterCard Sonia Sánchez",
                "MasterCard", 633417920970L, sdf.parse("4/9/2025"), 855, "Sonia Sánchez");
        this.service.createPurchase(pos033, 9, user058, delivery08, purchase087_payment, "Calle 45 Nº1763", -34.938855F,
                -57.981561F, sdf.parse("31/8/2019"));
        CreditCardPayment purchase088_payment = this.service.createCreditCardPayment("Visa Mario Moreno", "Visa",
                413220893784L, sdf.parse("20/6/2025"), 4, "Mario Moreno");
        this.service.createPurchase(pos037, 10, user049, delivery07, purchase088_payment, "Calle 35 Nº57", -34.913206F,
                -57.979091F, sdf.parse("30/4/2020"));
        OnDeliveryPayment purchase089_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos099", 357856.0F);
        this.service.createPurchase(pos099, 8, user056, delivery06, purchase089_payment, "Calle 35 Nº1810", -34.935027F,
                -57.922112F, sdf.parse("20/2/2020"));
        OnDeliveryPayment purchase090_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos088c",
                136800.0F);
        this.service.createPurchase(pos088, 2, user021, delivery03, purchase090_payment, "Calle 63 Nº1361", -34.948701F,
                -57.958781F, sdf.parse("19/11/2019"));
        OnDeliveryPayment purchase091_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos007", 621900.0F);
        this.service.createPurchase(pos007, 5, user042, delivery03, purchase091_payment, "Calle 55 Nº1328", -34.92867F,
                -57.914355F, sdf.parse("11/5/2021"));
        CreditCardPayment purchase092_payment = this.service.createCreditCardPayment("Amex Florencia Alonso", "Amex",
                46134456548L, sdf.parse("11/4/2021"), 382, "Florencia Alonso");
        this.service.createPurchase(pos008, 4, user103, delivery06, purchase092_payment, "Calle 52 Nº1678", -34.905585F,
                -57.936804F, sdf.parse("31/5/2020"));
        CreditCardPayment purchase093_payment = this.service.createCreditCardPayment("MasterCard Sonia Blanco 2",
                "MasterCard", 333213333661L, sdf.parse("22/3/2022"), 317, "Sonia Blanco");
        this.service.createPurchase(pos088, 3, user062, delivery06, purchase093_payment, "Calle 51 Nº1456", -34.947103F,
                -57.929381F, sdf.parse("26/11/2019"));
        OnDeliveryPayment purchase094_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos054b",
                230200.0F);
        this.service.createPurchase(pos054, 5, user050, delivery06, purchase094_payment, "Calle 59 Nº765", -34.911092F,
                -57.921477F, sdf.parse("22/11/2019"));
        OnDeliveryPayment purchase095_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos075", 75100.0F);
        this.service.createPurchase(pos075, 1, user043, delivery03, purchase095_payment, "Calle 35 Nº1351", -34.939598F,
                -57.987687F, sdf.parse("5/4/2021"));
        OnDeliveryPayment purchase096_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos009", 135464.0F);
        this.service.createPurchase(pos009, 4, user074, delivery06, purchase096_payment, "Calle 34 Nº1288", -34.943179F,
                -57.917879F, sdf.parse("11/8/2019"));
        CreditCardPayment purchase097_payment = this.service.createCreditCardPayment("Amex Luz Sánchez", "Amex",
                926167209132L, sdf.parse("25/7/2021"), 93, "Luz Sánchez");
        this.service.createPurchase(pos063, 3, user095, delivery08, purchase097_payment, "Calle 52 Nº945", -34.948447F,
                -57.93781F, sdf.parse("22/1/2021"));
        CreditCardPayment purchase098_payment = this.service.createCreditCardPayment("Amex Ana Muñoz", "Amex",
                310067333891L, sdf.parse("2/12/2022"), 302, "Ana Muñoz");
        this.service.createPurchase(pos094, 7, user027, delivery08, purchase098_payment, "Calle 51 Nº436", -34.907003F,
                -57.967119F, sdf.parse("28/9/2020"));
        CreditCardPayment purchase099_payment = this.service.createCreditCardPayment("Amex Juan Hernández 2", "Amex",
                135639979568L, sdf.parse("19/9/2021"), 701, "Juan Hernández");
        this.service.createPurchase(pos020, 9, user104, delivery07, purchase099_payment, "Calle 45 Nº8", -34.935482F,
                -57.939448F, sdf.parse("16/12/2019"));
        OnDeliveryPayment purchase100_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos082", 95529.0F);
        this.service.createPurchase(pos082, 1, user100, delivery06, purchase100_payment, "Calle 54 Nº779", -34.938689F,
                -57.919862F, sdf.parse("10/12/2019"));
        OnDeliveryPayment purchase101_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos007b",
                746200.0F);
        this.service.createPurchase(pos007, 6, user052, delivery03, purchase101_payment, "Calle 49 Nº474", -34.919029F,
                -57.977259000000004F, sdf.parse("30/4/2021"));
        CreditCardPayment purchase102_payment = this.service.createCreditCardPayment("MasterCard Selene Duran",
                "MasterCard", 461500761780L, sdf.parse("14/10/2023"), 443, "Selene Duran");
        this.service.createPurchase(pos022, 10, user076, delivery08, purchase102_payment, "Calle 41 Nº1034",
                -34.915525F, -57.934385F, sdf.parse("25/2/2020"));
        OnDeliveryPayment purchase103_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos044", 241400.0F);
        this.service.createPurchase(pos044, 5, user096, delivery07, purchase103_payment, "Calle 34 Nº385", -34.923035F,
                -57.942181F, sdf.parse("18/4/2019"));
        CreditCardPayment purchase104_payment = this.service.createCreditCardPayment("Amex Carlos Herrero", "Amex",
                590988751310L, sdf.parse("16/6/2024"), 748, "Carlos Herrero");
        this.service.createPurchase(pos063, 5, user021, delivery06, purchase104_payment, "Calle 52 Nº154", -34.905521F,
                -57.980823F, sdf.parse("11/2/2021"));
        OnDeliveryPayment purchase105_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos002b",
                789600.0F);
        this.service.createPurchase(pos002, 7, user033, delivery08, purchase105_payment, "Calle 65 Nº1268", -34.917522F,
                -57.915258F, sdf.parse("5/6/2020"));
        CreditCardPayment purchase106_payment = this.service.createCreditCardPayment("Amex Carlos Molina", "Amex",
                153289299064L, sdf.parse("27/4/2025"), 333, "Carlos Molina");
        this.service.createPurchase(pos022, 3, user084, delivery08, purchase106_payment, "Calle 44 Nº812", -34.9388F,
                -57.968491F, sdf.parse("20/1/2020"));
        OnDeliveryPayment purchase107_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos075b",
                749000.0F);
        this.service.createPurchase(pos075, 10, user051, delivery08, purchase107_payment, "Calle 58 Nº1122",
                -34.941774F, -57.935689F, sdf.parse("16/3/2021"));
        CreditCardPayment purchase108_payment = this.service.createCreditCardPayment("MasterCard Javier Vicente",
                "MasterCard", 288450798620L, sdf.parse("21/6/2021"), 992, "Javier Vicente");
        this.service.createPurchase(pos070, 4, user048, delivery06, purchase108_payment, "Calle 70 Nº1499", -34.947623F,
                -57.92105F, sdf.parse("5/4/2019"));
        OnDeliveryPayment purchase109_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos044b",
                433702.0F);
        this.service.createPurchase(pos044, 9, user056, delivery07, purchase109_payment, "Calle 58 Nº1556", -34.934833F,
                -57.982787F, sdf.parse("13/6/2019"));
        CreditCardPayment purchase110_payment = this.service.createCreditCardPayment("Amex Juan Hernández 3", "Amex",
                168047965117L, sdf.parse("14/11/2024"), 382, "Juan Hernández");
        this.service.createPurchase(pos078, 8, user104, delivery07, purchase110_payment, "Calle 49 Nº380", -34.927236F,
                -57.951584F, sdf.parse("14/4/2020"));
        OnDeliveryPayment purchase111_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos029b",
                141200.0F);
        this.service.createPurchase(pos029, 7, user093, delivery07, purchase111_payment, "Calle 45 Nº1824", -34.919138F,
                -57.96008F, sdf.parse("14/11/2019"));
        CreditCardPayment purchase112_payment = this.service.createCreditCardPayment("MasterCard Florencia Alonso",
                "MasterCard", 882011505254L, sdf.parse("11/5/2023"), 967, "Florencia Alonso");
        this.service.createPurchase(pos082, 3, user103, delivery08, purchase112_payment, "Calle 64 Nº312", -34.933835F,
                -57.93716F, sdf.parse("1/12/2019"));
        OnDeliveryPayment purchase113_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos040", 537823.0F);
        this.service.createPurchase(pos040, 9, user103, delivery07, purchase113_payment, "Calle 35 Nº917", -34.908523F,
                -57.950872F, sdf.parse("13/12/2020"));
        CreditCardPayment purchase114_payment = this.service.createCreditCardPayment("Visa Florencia Arias 2", "Visa",
                102594037588L, sdf.parse("19/7/2022"), 298, "Florencia Arias");
        this.service.createPurchase(pos096, 2, user004, delivery06, purchase114_payment, "Calle 69 Nº1294", -34.914777F,
                -57.987886F, sdf.parse("3/12/2020"));
        CreditCardPayment purchase115_payment = this.service.createCreditCardPayment("Visa Mariana Alonso", "Visa",
                826421142940L, sdf.parse("17/12/2021"), 660, "Mariana Alonso");
        this.service.createPurchase(pos012, 1, user003, delivery05, purchase115_payment, "Calle 66 Nº762", -34.912209F,
                -57.959228F, sdf.parse("1/1/2020"));
        CreditCardPayment purchase116_payment = this.service.createCreditCardPayment("MasterCard Rubén Vázquez",
                "MasterCard", 374964354735L, sdf.parse("5/7/2023"), 26, "Rubén Vázquez");
        this.service.createPurchase(pos080, 5, user022, delivery08, purchase116_payment, "Calle 39 Nº1693", -34.915087F,
                -57.94509F, sdf.parse("15/9/2020"));
        OnDeliveryPayment purchase117_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos083b",
                107593.0F);
        this.service.createPurchase(pos083, 1, user087, delivery08, purchase117_payment, "Calle 39 Nº1869", -34.91683F,
                -57.958519F, sdf.parse("14/3/2020"));
        OnDeliveryPayment purchase118_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos024", 510200.0F);
        this.service.createPurchase(pos024, 5, user017, delivery08, purchase118_payment, "Calle 36 Nº876", -34.931261F,
                -57.938915F, sdf.parse("30/7/2020"));
        OnDeliveryPayment purchase119_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos037b",
                401540.0F);
        this.service.createPurchase(pos037, 5, user099, delivery03, purchase119_payment, "Calle 55 Nº1409", -34.917177F,
                -57.916786F, sdf.parse("26/6/2020"));
        CreditCardPayment purchase120_payment = this.service.createCreditCardPayment("MasterCard Natalio Cabrera",
                "MasterCard", 705906542347L, sdf.parse("1/6/2022"), 172, "Natalio Cabrera");
        this.service.createPurchase(pos027, 7, user015, delivery04, purchase120_payment, "Calle 39 Nº534", -34.924841F,
                -57.938813F, sdf.parse("12/5/2020"));
        CreditCardPayment purchase121_payment = this.service.createCreditCardPayment("MasterCard Paula Morales",
                "MasterCard", 657403813515L, sdf.parse("25/12/2025"), 985, "Paula Morales");
        this.service.createPurchase(pos025, 7, user029, delivery03, purchase121_payment, "Calle 47 Nº1392", -34.916584F,
                -57.940761F, sdf.parse("24/10/2019"));
        OnDeliveryPayment purchase122_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos054c",
                138880.0F);
        this.service.createPurchase(pos054, 3, user046, delivery07, purchase122_payment, "Calle 64 Nº792", -34.921708F,
                -57.958954F, sdf.parse("23/9/2019"));
        OnDeliveryPayment purchase123_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos065", 173600.0F);
        this.service.createPurchase(pos065, 5, user067, delivery06, purchase123_payment, "Calle 45 Nº1917", -34.945957F,
                -57.958943F, sdf.parse("5/2/2020"));
        CreditCardPayment purchase124_payment = this.service.createCreditCardPayment("Visa Selene Calvo", "Visa",
                724777186161L, sdf.parse("28/1/2021"), 330, "Selene Calvo");
        this.service.createPurchase(pos064, 9, user077, delivery08, purchase124_payment, "Calle 57 Nº131", -34.940068F,
                -57.971744F, sdf.parse("19/10/2019"));
        OnDeliveryPayment purchase125_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos045", 495400.0F);
        this.service.createPurchase(pos045, 9, user063, delivery08, purchase125_payment, "Calle 37 Nº775", -34.915377F,
                -57.946612F, sdf.parse("25/10/2019"));
        CreditCardPayment purchase126_payment = this.service.createCreditCardPayment("Visa Luz Muñoz", "Visa",
                433755687640L, sdf.parse("19/3/2025"), 132, "Luz Muñoz");
        this.service.createPurchase(pos046, 8, user092, delivery03, purchase126_payment, "Calle 57 Nº1637", -34.946051F,
                -57.984681F, sdf.parse("1/1/2020"));
        OnDeliveryPayment purchase127_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos099b",
                447820.0F);
        this.service.createPurchase(pos099, 10, user031, delivery07, purchase127_payment, "Calle 44 Nº1658",
                -34.941948000000004F, -57.916023F, sdf.parse("23/2/2020"));
        OnDeliveryPayment purchase128_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos026", 20409.0F);
        this.service.createPurchase(pos026, 1, user108, delivery01, purchase128_payment, "Calle 71 Nº1741", -34.924064F,
                -57.92566F, sdf.parse("23/12/2019"));
        CreditCardPayment purchase129_payment = this.service.createCreditCardPayment("Visa Javier Campos", "Visa",
                953418118857L, sdf.parse("17/2/2023"), 99, "Javier Campos");
        this.service.createPurchase(pos051, 1, user098, delivery05, purchase129_payment, "Calle 49 Nº1907", -34.919071F,
                -57.97885F, sdf.parse("23/6/2020"));
        CreditCardPayment purchase130_payment = this.service.createCreditCardPayment("MasterCard Florencia Morales",
                "MasterCard", 964642106073L, sdf.parse("18/11/2021"), 740, "Florencia Morales");
        this.service.createPurchase(pos015, 5, user108, delivery05, purchase130_payment, "Calle 61 Nº1632", -34.935889F,
                -57.918026F, sdf.parse("18/9/2021"));
        CreditCardPayment purchase131_payment = this.service.createCreditCardPayment("Amex Matias Herrero", "Amex",
                879592656101L, sdf.parse("8/8/2023"), 314, "Matias Herrero");
        this.service.createPurchase(pos089, 7, user075, delivery07, purchase131_payment, "Calle 59 Nº1533", -34.905765F,
                -57.916552F, sdf.parse("11/7/2019"));
        OnDeliveryPayment purchase132_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos026b", 20600.0F);
        this.service.createPurchase(pos026, 1, user030, delivery03, purchase132_payment, "Calle 51 Nº324", -34.925767F,
                -57.952089F, sdf.parse("29/1/2020"));
        OnDeliveryPayment purchase133_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos067", 142800.0F);
        this.service.createPurchase(pos067, 2, user029, delivery03, purchase133_payment, "Calle 47 Nº555", -34.911707F,
                -57.947299F, sdf.parse("17/5/2019"));
        CreditCardPayment purchase134_payment = this.service.createCreditCardPayment("Amex Selene Martin", "Amex",
                13782370842L, sdf.parse("22/1/2024"), 640, "Selene Martin");
        this.service.createPurchase(pos011, 8, user090, delivery07, purchase134_payment, "Calle 37 Nº154", -34.929819F,
                -57.968157F, sdf.parse("23/9/2019"));
        CreditCardPayment purchase135_payment = this.service.createCreditCardPayment("Amex Mario Moreno", "Amex",
                419736794392L, sdf.parse("19/1/2023"), 516, "Mario Moreno");
        this.service.createPurchase(pos053, 1, user049, delivery03, purchase135_payment, "Calle 72 Nº928", -34.938618F,
                -57.982730000000004F, sdf.parse("18/11/2020"));
        CreditCardPayment purchase136_payment = this.service.createCreditCardPayment("MasterCard Natalio Lozano",
                "MasterCard", 936209401551L, sdf.parse("18/10/2025"), 871, "Natalio Lozano");
        this.service.createPurchase(pos003, 4, user080, delivery04, purchase136_payment, "Calle 55 Nº1017", -34.9469F,
                -57.969933F, sdf.parse("13/10/2019"));
        OnDeliveryPayment purchase137_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos052b",
                446400.0F);
        this.service.createPurchase(pos052, 4, user102, delivery08, purchase137_payment, "Calle 56 Nº1820", -34.905025F,
                -57.991051F, sdf.parse("6/9/2020"));
        OnDeliveryPayment purchase138_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos004", 801827.0F);
        this.service.createPurchase(pos004, 7, user049, delivery05, purchase138_payment, "Calle 52 Nº816", -34.932345F,
                -57.992476F, sdf.parse("9/1/2020"));
        CreditCardPayment purchase139_payment = this.service.createCreditCardPayment("Amex Natalio Carrasco", "Amex",
                453550667248L, sdf.parse("9/4/2024"), 826, "Natalio Carrasco");
        this.service.createPurchase(pos096, 6, user105, delivery06, purchase139_payment, "Calle 38 Nº1984", -34.928439F,
                -57.96561F, sdf.parse("29/9/2020"));
        CreditCardPayment purchase140_payment = this.service.createCreditCardPayment("Visa Silvia Muñoz", "Visa",
                718705271240L, sdf.parse("25/11/2023"), 280, "Silvia Muñoz");
        this.service.createPurchase(pos029, 1, user002, delivery06, purchase140_payment, "Calle 64 Nº827", -34.918081F,
                -57.926662F, sdf.parse("7/11/2019"));
        CreditCardPayment purchase141_payment = this.service.createCreditCardPayment("MasterCard Florencia Alonso 2",
                "MasterCard", 775006559572L, sdf.parse("22/6/2025"), 535, "Florencia Alonso");
        this.service.createPurchase(pos024, 9, user103, delivery07, purchase141_payment, "Calle 39 Nº596", -34.934393F,
                -57.970249F, sdf.parse("29/6/2020"));
        OnDeliveryPayment purchase142_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos024b",
                813520.0F);
        this.service.createPurchase(pos024, 8, user074, delivery06, purchase142_payment, "Calle 45 Nº1187", -34.918227F,
                -57.977422F, sdf.parse("12/9/2020"));
        OnDeliveryPayment purchase143_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos041", 327100.0F);
        this.service.createPurchase(pos041, 5, user110, delivery08, purchase143_payment, "Calle 55 Nº770", -34.922324F,
                -57.949758F, sdf.parse("23/1/2021"));
        OnDeliveryPayment purchase144_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos027", 198157.0F);
        this.service.createPurchase(pos027, 9, user003, delivery06, purchase144_payment, "Calle 71 Nº28", -34.942264F,
                -57.972198F, sdf.parse("29/4/2020"));
        OnDeliveryPayment purchase145_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos019b",
                149200.0F);
        this.service.createPurchase(pos019, 3, user057, delivery07, purchase145_payment, "Calle 69 Nº1006", -34.947996F,
                -57.974201F, sdf.parse("13/9/2019"));
        CreditCardPayment purchase146_payment = this.service.createCreditCardPayment("Amex Rubén Pastor", "Amex",
                889130549453L, sdf.parse("23/12/2022"), 617, "Rubén Pastor");
        this.service.createPurchase(pos100, 4, user028, delivery06, purchase146_payment, "Calle 57 Nº1414", -34.941027F,
                -57.976409F, sdf.parse("28/4/2019"));
        CreditCardPayment purchase147_payment = this.service.createCreditCardPayment("Visa Silvia Sáez 2", "Visa",
                289190085740L, sdf.parse("26/9/2023"), 418, "Silvia Sáez");
        this.service.createPurchase(pos005, 9, user059, delivery04, purchase147_payment, "Calle 34 Nº223", -34.931081F,
                -57.942786F, sdf.parse("4/12/2020"));
        CreditCardPayment purchase148_payment = this.service.createCreditCardPayment("MasterCard Fernanda Sanz",
                "MasterCard", 126931376815L, sdf.parse("17/11/2022"), 336, "Fernanda Sanz");
        this.service.createPurchase(pos002, 3, user064, delivery07, purchase148_payment, "Calle 38 Nº513", -34.942925F,
                -57.97442F, sdf.parse("6/6/2020"));
        OnDeliveryPayment purchase149_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos027b",
                111865.0F);
        this.service.createPurchase(pos027, 5, user004, delivery05, purchase149_payment, "Calle 38 Nº1802", -34.927363F,
                -57.915501F, sdf.parse("9/3/2020"));
        OnDeliveryPayment purchase150_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos099c",
                447220.0F);
        this.service.createPurchase(pos099, 10, user008, delivery06, purchase150_payment, "Calle 60 Nº988", -34.915652F,
                -57.981291F, sdf.parse("7/1/2020"));
        CreditCardPayment purchase151_payment = this.service.createCreditCardPayment("MasterCard Carlos Pascual 2",
                "MasterCard", 645205752293L, sdf.parse("24/1/2023"), 973, "Carlos Pascual");
        this.service.createPurchase(pos074, 2, user085, delivery05, purchase151_payment, "Calle 51 Nº1058", -34.928131F,
                -57.974004F, sdf.parse("15/11/2020"));
        OnDeliveryPayment purchase152_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos008c",
                107628.0F);
        this.service.createPurchase(pos008, 2, user043, delivery07, purchase152_payment, "Calle 45 Nº1549", -34.944469F,
                -57.951943F, sdf.parse("31/3/2020"));
        CreditCardPayment purchase153_payment = this.service.createCreditCardPayment("MasterCard Beatriz Román 2",
                "MasterCard", 474421784968L, sdf.parse("10/1/2025"), 607, "Beatriz Román");
        this.service.createPurchase(pos051, 6, user102, delivery06, purchase153_payment, "Calle 71 Nº1511", -34.915519F,
                -57.984905F, sdf.parse("3/7/2020"));
        OnDeliveryPayment purchase154_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos067b",
                712080.0F);
        this.service.createPurchase(pos067, 10, user029, delivery06, purchase154_payment, "Calle 63 Nº748", -34.911401F,
                -57.949257F, sdf.parse("25/3/2019"));
        OnDeliveryPayment purchase155_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos016", 27800.0F);
        this.service.createPurchase(pos016, 1, user070, delivery04, purchase155_payment, "Calle 44 Nº1924", -34.942625F,
                -57.91382F, sdf.parse("9/12/2019"));
        OnDeliveryPayment purchase156_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos085", 44700.0F);
        this.service.createPurchase(pos085, 2, user100, delivery06, purchase156_payment, "Calle 62 Nº1158", -34.923533F,
                -57.972082F, sdf.parse("22/5/2020"));
        OnDeliveryPayment purchase157_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos074b",
                297430.0F);
        this.service.createPurchase(pos074, 5, user078, delivery07, purchase157_payment, "Calle 70 Nº76", -34.942354F,
                -57.927362F, sdf.parse("21/12/2020"));
        OnDeliveryPayment purchase158_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos074c",
                475300.0F);
        this.service.createPurchase(pos074, 8, user109, delivery07, purchase158_payment, "Calle 46 Nº778", -34.942249F,
                -57.927298F, sdf.parse("14/1/2021"));
        OnDeliveryPayment purchase159_payment = this.service.createOnDeliveryPayment("Pago Efectivo pos070", 79791.0F);
        this.service.createPurchase(pos070, 1, user072, delivery05, purchase159_payment, "Calle 67 Nº1366", -34.913902F,
                -57.917141F, sdf.parse("23/4/2019"));
        CreditCardPayment purchase160_payment = this.service.createCreditCardPayment("Visa Eduardo Soler", "Visa",
                612109731236L, sdf.parse("22/1/2024"), 728, "Eduardo Soler");
        this.service.createPurchase(pos020, 2, user024, delivery04, purchase160_payment, "Calle 45 Nº1611", -34.943761F,
                -57.962507F, sdf.parse("23/11/2019"));
        CreditCardPayment purchase161_payment = this.service.createCreditCardPayment("MasterCard Silvia Romero",
                "MasterCard", 195065046752L, sdf.parse("20/5/2024"), 458, "Silvia Romero");
        this.service.createPurchase(pos003, 8, user043, delivery03, purchase161_payment, "Calle 62 Nº1188", -34.91924F,
                -57.93294F, sdf.parse("7/11/2019"));
        CreditCardPayment purchase162_payment = this.service.createCreditCardPayment("Amex Eduardo Romero", "Amex",
                490267075827L, sdf.parse("2/5/2022"), 918, "Eduardo Romero");
        this.service.createPurchase(pos100, 9, user089, delivery07, purchase162_payment, "Calle 46 Nº1150", -34.90718F,
                -57.945807F, sdf.parse("27/4/2019"));
    }
}
