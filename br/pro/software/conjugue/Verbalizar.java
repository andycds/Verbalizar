package br.pro.software.conjugue;

import java.util.Map;
import java.util.TreeMap;

public class Verbalizar {

	Map<String, String[]> defectivos = new TreeMap<String, String[]>();

	final static String ftVerbais[] = {"infinitivo", "gerúndio", "particípio passado"};
	final static String pesVerbais[] = {"primeira", "segunda", "terceira"};
	final static String modVerbais[] = {"singular", "plural"};

	String temposVerbais[] = new String[3 + 12*6 - 2];

	final static String fvVerbais[] = { 
		"presente do indicativo",
		"pretérito imperfeito do indicativo",
		"pretérito perfeito do indicativo",
		"pretérito mais-que-perfeito do indicativo",
		"futuro do pretérito do indicativo",
		"futuro do presente do indicativo",
		"presente do subjuntivo",
		"pretérito imperfeito do subjuntivo",
		"futuro do subjuntivo",
		"imperativo afirmativo",
		"imperativo negativo",
		"infinitivo pessoal"
	};
	final static String c1a[] = {"ar","ando", "ado",
		"o", "as", "a", "amos", "ais", "am",
		"ava", "avas", "ava", "ávamos", "áveis", "avam",
		"ei", "aste", "ou", "ámos", "astes", "aram",
		"ara", "aras", "ara", "áramos", "áreis", "aram",
		"aria", "arias", "aria", "aríamos", "aríeis", "ariam",
		"arei", "arás", "ará", "aremos", "areis", "arão",
		"e", "es", "e", "emos", "eis", "em",
		"asse", "asses", "asse", "ássemos", "ásseis", "assem",
		"ar", "ares", "ar", "armos", "ardes", "arem",
		null, "a", "e", "emos", "ai", "em", 
		null, "es", "e", "emos", "eis", "em",
		"ar", "ares", "ar", "armos", "ardes", "arem"};

	final static String c2a[] = { "er", "endo", "ido",
		"o", "es", "e", "emos", "eis", "em",
		"ia", "ias", "ia", "íamos", "íeis", "iam",
		"i", "este", "eu", "emos", "estes", "eram",
		"era", "eras", "era", "êramos", "êreis", "eram",
		"eria", "erias", "eria", "eríamos", "eríeis", "eriam",
		"erei", "erás", "erá", "eremos", "ereis", "erão",
		"a", "as", "a", "amos", "ais", "am",
		"esse", "esses", "esse", "êssemos", "êsseis", "essem",
		"er", "eres", "er", "ermos", "erdes", "erem",
		null, "e", "a", "amos", "ei", "am",
		null, "as", "a", "amos", "ais", "am",
		"er", "eres", "er", "ermos", "erdes", "erem",
	};

	final static String c3a[] = {"ir", "indo", "ido",
		"o", "es", "e", "mos", "is", "em",
		"ia", "ias", "ia", "íamos", "íeis", "iam",
		"i", "iste", "iu", "imos", "istes", "iram",
		"ira", "iras", "ira", "íramos", "íreis", "iram",
		"iria", "irias", "iria", "iríamos", "iríeis", "iriam",
		"irei", "irás", "irá", "iremos", "ireis", "irão",
		"a", "as", "a", "amos", "ais", "am",
		"isse", "isses", "isse", "íssemos", "ísseis", "issem",
		"ir", "ires", "ir", "irmos", "irdes", "irem",
		null, "e", "a", "amos", "i", "am",
		null, "as", "a", "amos", "ais", "am",
		"ir", "ires", "ir", "irmos", "irdes", "irem"
	};


	final static String abaular[] = {"abaular", "abaulando", "abaulado",
		"abaúlo", "abaúlas", "abaúla", "abaulamos", "abaulais", "abaúlam",
		"abaulava", "abaulavas", "abaulava", "abaulávamos", "abauláveis", "abaulavam",
		"abaulei", "abaulaste", "abaulou", "abaulamos", "abaulastes", "abaularam", 
		"abaulara", "abaularas", "abaulara", "abauláramos", "abauláreis", "abaularam",
		"abaularia", "abaularias", "abaularia", "abaularíamos", "abaularíeis", "abaulariam", 
		"abaularei", "abaularás", "abaulará", "abaularemos", "abaulareis", "abaularão", 
		"abaúle", "abaúles", "abaúle", "abaulemos", "abauleis", "abaúlem", 
		"abaulasse", "abaulasses", "abaulasse", "abaulássemos", "abaulásseis", "abaulassem", 
		"abaular", "abaulares", "abaular", "abaularmos", "abaulardes", "abaularem",
		null, "abaúla", "abaúle", "abaulemos", "abaulai", "abaúlem", 
		null, "abaúles", "abaúle", "abaulemos", "abauleis", "abaúlem",
		"abaular", "abaulares", "abaular", "abaularmos", "abaulardes", "abaularem"};

	final static String abolir[] = {"abolir", "abolindo", "abolido",
		null, "aboles", "abole", "abolimos", "abolis", "abolem",
		"abolia", "abolias", "abolia", "abolíamos", "abolíeis", "aboliam",
		"aboli", "aboliste", "aboliu", "abolimos", "abolistes", "aboliram",
		"abolira", "aboliras", "abolira", "abolíramos", "abolíreis", "aboliram",
		"aboliria", "abolirias", "aboliria", "aboliríamos", "aboliríeis", "aboliriam",
		"abolirei", "abolirás", "abolirá", "aboliremos", "abolireis", "abolirão", 
		null, null, null, null, null, null,
		"abolisse", "abolisses", "abolisse", "abolíssemos", "abolísseis", "abolissem",
		"abolir", "abolires", "abolir", "abolirmos", "abolirdes", "abolirem",
		null, "abole", null, null, "aboli", null,
		null, null, null, null, null, null,
		"abolir", "abolires", "abolir", "abolirmos", "abolirdes", "abolirem"};

	final static String abracar[] = {"abraçar", "abraçando", "abraçado",
		"abraço", "abraças", "abraça", "abraçamos", "abraçais", "abraçam",
		"abraçava", "abraçavas", "abraçava", "abraçávamos", "abraçáveis", "abraçavam",
		"abracei", "abraçaste", "abraçou", "abraçamos", "abraçastes", "abraçaram",
		"abraçara", "abraçaras", "abraçara", "abraçáramos", "abraçáreis", "abraçaram",
		"abraçaria", "abraçarias", "abraçaria", "abraçaríamos", "abraçaríeis", "abraçariam",
		"abraçarei", "abraçarás", "abraçará", "abraçaremos", "abraçareis", "abraçarão",
		"abrace", "abraces", "abrace", "abracemos", "abraceis", "abracem",
		"abraçasse", "abraçasses", "abraçasse", "abraçássemos", "abraçásseis", "abraçassem",
		"abraçar", "abraçares", "abraçar", "abraçarmos", "abraçardes", "abraçarem",
		null, "abraça", "abraça", "abracemos", "abraçai", "abracem",
		null, "abraces", "abrace", "abracemos", "abraceis", "abracem",
		"abraçar", "abraçares", "abraçar", "abraçarmos", "abraçardes", "abraçarem"};

	final static String abrir[] = {"abrir", "abrindo", "aberto",
		"abro", "abres", "abre", "abrimos", "abris", "abrem",
		"abria", "abrias", "abria", "abríamos", "abríeis", "abriam",
		"abri", "abriste", "abriu", "abrimos", "abristes", "abriram",
		"abrira", "abriras", "abrira", "abríramos", "abríreis", "abriram",
		"abriria", "abririas", "abriria", "abriríamos", "abriríeis", "abririam",
		"abrirei", "abrirás", "abrirá", "abriremos", "abrireis", "abrirão",
		"abra", "abras", "abra", "abramos", "abrais", "abram",
		"abrisse", "abrisses", "abrisse", "abríssemos", "abrísseis", "abrissem",
		"abrir", "abrires", "abrir", "abrirmos", "abrirdes", "abrirem",
		null, "abre", "abra", "abramos", "abri", "abram",
		null, "abras", "abra", "abramos", "abrais", "abram",
		"abrir", "abrires", "abrir", "abrirmos", "abrirdes", "abrirem"};

	final static String acudir[] = {"acudir", "acudindo", "acudido",
		"acudo", "acodes", "acode", "acudimos", "acudis", "acodem",
		"acudia", "acudias", "acudia", "acudíamos", "acudíeis", "acudiam",
		"acudi", "acudiste", "acudiu", "acudimos", "acudistes", "acudiram",
		"acudira", "acudiras", "acudira", "acudíramos", "acudíreis", "acudiram",
		"acudiria", "acudirias", "acudiria", "acudiríamos", "acudiríeis", "acudiriam",
		"acudirei", "acudirás", "acudirá", "acudiremos", "acudireis", "acudirão",
		"acuda", "acudas", "acuda", "acudamos", "acudais", "acudam",
		"acudisse", "acudisses", "acudisse", "acudíssemos", "acudísseis", "acudissem",
		"acudir", "acudires", "acudir", "acudirmos", "acudirdes", "acudirem",
		null, "acode", "acuda", "acudamos", "acudi", "acudam", 
		null, "acudas", "acuda", "acudamos", "acudais", "acudam", 
		"acudir", "acudires", "acudir", "acudirmos", "acudirdes", "acudirem"
	};
	
	final static String adequar[] = {"adequar", "adequando", "adequado",
		"adéquo", "adéquas", "adéqua", "adequamos", "adequais", "adéquam",
		"adequava", "adequavas", "adequava", "adequávamos", "adequáveis", "adequavam",
		"adequei", "adequaste", "adequou", "adequamos", "adequastes", "adequaram",
		"adequara", "adequaras", "adequara", "adequáramos", "adequáreis", "adequaram",
		"adequaria", "adequarias", "adequaria", "adequaríamos", "adequaríeis", "adequariam",
		"adequarei", "adequarás", "adequará", "adequaremos", "adequareis", "adequarão",
		"adéque", "adéques", "adéque", "adequemos", "adequeis", "adéquem",
		"adequasse", "adequasses", "adequasse", "adequássemos", "adequásseis", "adequassem",
		"adequar", "adequares", "adequar", "adequarmos", "adequardes", "adequarem",
		null, "adéqua", "adéque", "adequemos", "adequai", "adéquem",
		null, "adéques", "adéque", "adequemos", "adequeis", "adéquem",
		"adequar", "adequares", "adequar", "adequarmos", "adequardes", "adequarem"
	};
	
	final static String adir[] = {"adir", "adindo", "adido",
		null, null, null, "adimos", "adis", null,
		"adia", "adias", "adia", "adíamos", "adíeis", "adiam",
		"adi", "adiste", "adiu", "adimos", "adistes", "adiram",
		"adira", "adiras", "adira", "adíramos", "adíreis", "adiram",
		"adiria", "adirias", "adiria", "adiríamos", "adiríeis", "adiriam",
		"adirei", "adirás", "adirá", "adiremos", "adireis", "adirão",
		null, null, null, null, null, null,
		"adisse", "adisses", "adisse", "adíssemos", "adísseis", "adissem",
		"adir", "adires", "adir", "adirmos", "adirdes", "adirem",
		null, null, null, null, "adi", null,
		null, null, null, null, null, null, 
		"adir", "adires", "adir", "adirmos", "adirdes", "adirem"	
	};
	
	final static String advertir[] = {"advertir", "advertindo", "advertido",
		"advirto", "advertes", "adverte", "advertimos", "advertis", "advertem",
		"advertia", "advertias", "advertia", "advertíamos", "advertíeis", "advertiam",
		"adverti", "advertiste", "advertiu", "advertimos", "advertistes", "advertiram",
		"advertira", "advertiras", "advertira", "advertíramos", "advertíreis", "advertiram",
		"advertiria", "advertirias", "advertiria", "advertiríamos", "advertiríeis", "advertiriam",
		"advertirei", "advertirás", "advertirá", "advertiremos", "advertireis", "advertirão",
		"advirta", "advirtas", "advirta", "advirtamos", "advirtais", "advirtam",
		"advertisse", "advertisses", "advertisse", "advertíssemos", "advertísseis", "advertissem",
		"advertir", "advertires", "advertir", "advertirmos", "advertirdes", "advertirem",
		null, "adverte", "advirta", "advirtamos", "adverti", "advirtam",
		null, "advirtas", "advirta", "advirtamos", "advirtais", "advirtam",  
		"advertir", "advertires", "advertir", "advertirmos", "advertirdes", "advertirem"};
	
	final static String advir[] = {"advir", "advindo", "advindo",
		"advenho", "advéns", "advém", "advimos", "advindes", "advêm", 
		"advinha", "advinhas", "advinha", "advínhamos", "advínheis", "advinham", 
		"advim", "advieste", "adveio", "adviemos", "adviestes", "advieram", 
		"adviera", "advieras", "adviera", "adviéramos", "adviéreis", "advieram", 
		"adviria", "advirias", "adviria", "adviríamos", "adviríeis", "adviriam", 
		"advirei", "advirás", "advirá", "adviremos", "advireis", "advirão", 
		"advenha", "advenham", "advenha", "advenhamos", "advenhais", "advenham", 
		"adviesse", "adviesses", "adviesse", "adviéssemos", "adviésseis", "adviessem", 
		"advier", "advieres", "advier", "adviermos", "advierdes", "advierem", 
		null, "advém", "advenha", "advenhamos", "advinde", "advenham", 
		null, "advenhas", "advenha", "advenhamos", "advenhais", "advenham", 
		"advir", "advires", "advir", "advirmos", "advirdes", "advirem", 
	};
	
	final static String afligir[] = {"afligir", "afligindo", "afligido",
		"aflijo", "afliges", "aflige", "afligimos", "afligis", "afligem", 
		"afligia", "afligias", "afligia", "afligíamos", "afligíeis", "afligiam", 
		"afligi", "afligiste", "afligiu", "afligimos", "afligistes", "afligiram", 
		"afligira", "afligiras", "afligira", "afligíramos", "afligíreis", "afligiram", 
		"afligiria", "afligirias", "afligiria", "afligiríamos", "afligiríeis", "afligiriam", 
		"afligirei", "afligirás", "afligirá", "afligiremos", "afligireis", "afligirão", 
		"aflija", "aflijas", "aflija", "aflijamos", "aflijais", "aflijam", 
		"afligisse", "afligisses", "afligisse", "afligíssemos", "afligísseis", "afligissem", 
		"afligir", "afligires", "afligir", "afligirmos", "afligirdes", "afligirem", 
		null, "aflige", "aflija", "aflijamos", "afligi", "aflijam", 
		null, "aflijas", "aflija", "aflijamos", "aflijais", "aflijam", 
		"afligir", "afligires", "afligir", "afligirmos", "afligirdes", "afligirem", 
};
	final static String aguar[] = {"aguar", "aguando", "aguado",
		"águo", "águas", "água", "aguamos", "aguais", "águam", 
		"aguava", "aguavas", "aguava", "aguávamos", "aguáveis", "aguavam", 
		"agüei", "aguaste", "aguou", "aguamos", "aguastes", "aguou", 
		"aguara", "aguaras", "aguara", "aguáramos", "aguáreis", "aguaram", 
		"aguaria", "aguarias", "aguaria", "aguaríamos", "aguaríeis", "aguariam", 
		"aguarei", "aguarás", "aguará", "aguaremos", "aguareis", "aguarão", 
		"ágüe", "ágües", "ágüe", "agüemos", "agüeis", "ágüem", 
		"aguasse", "aguasses", "aguasse", "aguássemos", "aguásseis", "aguassem", 
		"aguar", "aguares", "aguar", "aguarmos", "aguardes", "aguarem", 
		null, "água", "ágüe", "agüemos", "aguai", "ágüem", 
		null, "águas", "água", "aguamos", "aguais", "águam", 
		"aguar", "aguares", "aguar", "aguarmos", "aguardes", "aguarem", 
};
	
	final static String apaziguar[] = {"apaziguar", "apaziguando", "apaziguado",
		"apaziguo", "apaziguas", "apazigua", "apaziguamos", "apaziguais", "apaziguam", 
		"apaziguava", "apaziguavas", "apaziguava", "apaziguávamos", "apaziguáveis", "apaziguavam", 
		"apazigüei", "apaziguaste", "apaziguou", "apaziguamos", "apaziguastes", "apaziguaram", 
		"apaziguara", "apaziguaras", "apaziguara", "apaziguáramos", "apaziguáreis", "apaziguaram", 
		"apaziguaria", "apaziguarias", "apaziguaria", "apaziguaríamos", "apaziguaríeis", "apaziguariam", 
		"apaziguarei", "apaziguarás", "apaziguará", "apaziguaremos", "apaziguareis", "apaziguarão", 
		"apazigúe", "apazigúes", "apazigúe", "apazigüemos", "apazigüeis", "apazigúem", 
		"apaziguasse", "apaziguasses", "apaziguasse", "apaziguássemos", "apaziguásseis", "apaziguassem", 
		"apaziguar", "apaziguares", "apaziguar", "apaziguarmos", "apaziguardes", "apaziguarem", 
		null, "apazigua", "apazigúe", "apazigüemos", "apaziguai", "apazigúem", 
		null, "apazigúes", "apazigúe", "apazigüemos", "apazigüeis", "apazigúem", 
		"apaziguar", "apaziguares", "apaziguar", "apaziguarmos", "apaziguardes", "apaziguarem", 
};
	final static String apoiar[] = {"apoiar", "apoiando", "apoiado",
		"apóio", "apóias", "apóia", "apoiamos", "apoiais", "apóiam", 
		"apoiava", "apoiavas", "apoiava", "apoiávamos", "apoiáveis", "apoiavam", 
		"apoiei", "apoiaste", "apoiou", "apoiamos", "apoiastes", "apoiaram", 
		"apoiara", "apoiaras", "apoiara", "apoiáramos", "apoiáreis", "apoiaram", 
		"apoiaria", "apoiarias", "apoiaria", "apoiaríamos", "apoiaríeis", "apoiariam", 
		"apoiarei", "apoiarás", "apoiará", "apoiaremos", "apoiareis", "apoiarão", 
		"apóie", "apóies", "apóie", "apoiemos", "apoieis", "apóiem", 
		"apoiasse", "apoiasses", "apoiasse", "apoiássemos", "apoiásseis", "apoiassem", 
		"apoiar", "apoiares", "apoiar", "apoiarmos", "apoiardes", "apoiarem", 
		null, "apóia", "apóie", "apoiemos", "apoiai", "apóiem", 
		null, "apóies", "apóie", "apoiemos", "apoieis", "apóiem", 
		"apoiar", "apoiares", "apoiar", "apoiarmos", "apoiardes", "apoiarem", 
	};
	
	final static String arguir[] = {"argüir", "argüindo", "argüido",
		"arguo", "argúis", "argúi", "argüimos", "argüis", "argúem", 
		"argüia", "argüias", "argüia", "argüíamos", "argüíeis", "argüiam", 
		"argüi", "argüiste", "argüiu", "argüimos", "argüistes", "argüiram", 
		"argüira", "argüiras", "argüira", "argüíramos", "argüíreis", "argüiram", 
		"argüiria", "argüirias", "argüiria", "argüiríamos", "argüiríeis", "argüiriam", 
		"argüirei", "argüirás", "argüirá", "argüiremos", "argüireis", "argüirão", 
		"argua", "arguas", "argua", "arguamos", "arguais", "arguam", 
		"argüisse", "argüisses", "argüisse", "argüíssemos", "argüísseis", "argüissem", 
		"argüir", "argüires", "argüir", "argüirmos", "argüirdes", "argüirem", 
		null, "argúi", "argua", "arguamos", "argüi", "arguam", 
		null, "arguas", "argua", "arguamos", "arguais", "arguam", 
		"argüir", "argüires", "argüir", "argüirmos", "argüirdes", "argüirem", 
	};
	
	final static String arruinar[] = {"arruinar", "arruinando", "arruinado",
		"arruíno", "arruínas", "arruína", "arruinamos", "arruinais", "arruínam", 
		"arruinava", "arruinavas", "arruinava", "arruinávamos", "arruináveis", "arruinavam", 
		"arruinei", "arruinaste", "arruinou", "arruinamos", "arruinastes", "arruinaram", 
		"arruinara", "arruinaras", "arruinara", "arruináramos", "arruináreis", "arruinaram", 
		"arruinaria", "arruinarias", "arruinaria", "arruinaríamos", "arruinaríeis", "arruinariam", 
		"arruinarei", "arruinarás", "arruinará", "arruinaremos", "arruinareis", "arruinarão", 
		"arruíne", "arruínes", "arruíne", "arruinemos", "arruineis", "arruínem", 
		"arruinasse", "arruinasses", "arruinasse", "arruinássemos", "arruinásseis", "arruinassem", 
		"arruinar", "arruinares", "arruinar", "arruinarmos", "arruinardes", "arruinarem", 
		null, "arruína", "arruíne", "arruinemos", "arruinai", "arruínem", 
		null, "arruínes", "arruíne", "arruinemos", "arruineis", "arruínem", 
		"arruinar", "arruinares", "arruinar", "arruinarmos", "arruinardes", "arruinarem", 
	};
	
	final static String atribuir[] = {"atribuir", "atribuindo", "atribuído",
		"atribuo", "atribuis", "atribui", "atribuímos", "atribuís", "atribuem", 
		"atribuía", "atribuías", "atribuía", "atribuíamos", "atribuíeis", "atribuíam", 
		"atribuí", "atribuíste", "atribuiu", "atribuímos", "atribuístes", "atribuíram", 
		"atribuíra", "atribuíras", "atribuíra", "atribuíramos", "atribuíreis", "atribuíram", 
		"atribuiria", "atribuirias", "atribuiria", "atribuiríamos", "atribuiríeis", "atribuiriam", 
		"atribuirei", "atribuirás", "atribuirá", "atribuiremos", "atribuireis", "atribuirão", 
		"atribua", "atribuas", "atribua", "atribuamos", "atribuais", "atribuam", 
		"atribuísse", "atribuísses", "atribuísse", "atribuíssemos", "atribuísseis", "atribuíssem", 
		"atribuir", "atribuíres", "atribuir", "atribuirmos", "atribuirdes", "atribuírem", 
		null, "atribui", "atribua", "atribuamos", "atribuí", "atribuam", 
		null, "atribuas", "atribua", "atribuamos", "atribuais", "atribuam", 
		"atribuir", "atribuíres", "atribuir", "atribuirmos", "atribuirdes", "atribuírem", 
	};

	final static String bulir[] = {"bulir", "bulindo", "bulido",
		"bulo", "boles", "bole", "bulimos", "bulis", "bolem", 
		"bulia", "bulias", "bulia", "bulíamos", "bulíeis", "buliam", 
		"buli", "buliste", "buliu", "bulimos", "bulistes", "buliram", 
		"bulira", "buliras", "bulira", "bulíramos", "bulíreis", "buliram", 
		"buliria", "bulirias", "buliria", "buliríamos", "buliríeis", "buliriam", 
		"bulirei", "bulirás", "bulirá", "buliremos", "bulireis", "bulirão", 
		"bula", "bulas", "bula", "bulamos", "bulais", "bulam", 
		"bulisse", "bulisses", "bulisse", "bulíssemos", "bulísseis", "bulissem", 
		"bulir", "bulires", "bulir", "bulirmos", "bulirdes", "bulirem", 
		null, "bole", "bula", "bulamos", "buli", "bulam", 
		null, "bulas", "bula", "bulamos", "bulais", "bulam", 
		"bulir", "bulires", "bulir", "bulirmos", "bulirdes", "bulirem", 
	};

	final static String caber[] = {"caber", "cabendo", "cabido",
		"caibo", "cabes", "cabe", "cabemos", "cabeis", "cabem", 
		"cabia", "cabias", "cabia", "cabíamos", "cabíeis", "cabiam", 
		"coube", "coubeste", "coube", "coubemos", "coubestes", "couberam", 
		"coubera", "couberas", "coubera", "coubéramos", "coubéreis", "couberam", 
		"caberia", "caberias", "caberia", "caberíamos", "caberíeis", "caberiam", 
		"caberei", "caberás", "caberá", "caberemos", "cabereis", "caberão", 
		"caiba", "caibas", "caiba", "caibamos", "caibais", "caibam", 
		"coubesse", "coubesses", "coubesse", "coubéssemos", "coubésseis", "coubessem", 
		"couber", "couberes", "couber", "coubermos", "couberdes", "couberem", 
		null, "cabe", "caiba", "caibamos", "cabei", "caibam", 
		null, "caibas", "caiba", "caibamos", "caibais", "caibam", 
		"caber", "caberes", "caber", "cabermos", "caberdes", "caberem", 
	};
	
	final static String cair[] = {"cair", "caindo", "caído",
		"caio", "cais", "cai", "caímos", "caís", "caem", 
		"caía", "caías", "caía", "caíamos", "caíeis", "caíam", 
		"caí", "caíste", "caiu", "caímos", "caístes", "caíram", 
		"caíra", "caíras", "caíra", "caíramos", "caíreis", "caíram", 
		"cairia", "cairias", "cairia", "cairíamos", "cairíeis", "cairiam", 
		"cairei", "cairás", "cairá", "cairemos", "caireis", "cairão", 
		"caia", "caias", "caia", "caiamos", "caiais", "caiam", 
		"caísse", "caísses", "caísse", "caíssemos", "caísseis", "caíssem", 
		"cair", "caíres", "cair", "cairmos", "cairdes", "caírem", 
		null, "cai", "caia", "caiamos", "caí", "caiam", 
		null, "caias", "caia", "caiamos", "caiais", "caiam", 
		"cair", "caíres", "cair", "cairmos", "cairdes", "caírem", 
	};
	
	final static String cantar[] = {"cantar", "cantando", "cantado",
		"canto", "cantas", "canta", "cantamos", "cantais", "cantam", 
		"cantava", "cantavas", "cantava", "cantávamos", "cantáveis", "cantavam", 
		"cantei", "cantaste", "cantou", "cantamos", "cantastes", "cantaram", 
		"cantara", "cantaras", "cantara", "cantáramos", "cantáreis", "cantaram", 
		"cantaria", "cantarias", "cantaria", "cantaríamos", "cantaríeis", "cantariam", 
		"cantarei", "cantarás", "cantará", "cantaremos", "cantareis", "cantarão", 
		"cante", "cantes", "cante", "cantemos", "canteis", "cantem", 
		"cantasse", "cantasses", "cantasse", "cantássemos", "cantásseis", "cantassem", 
		"cantar", "cantares", "cantar", "cantarmos", "cantardes", "cantarem", 
		null, "canta", "cante", "cantemos", "cantai", "cantem", 
		null, "cantes", "cante", "cantemos", "canteis", "cantem", 
		"cantar", "cantares", "cantar", "cantarmos", "cantardes", "cantarem", 
	};
	
	final static String cegar[] = {"cegar", "cegando", "cegado",
		"cego", "cegas", "cega", "cegamos", "cegais", "cegam", 
		"cegava", "cegavas", "cegava", "cegávamos", "cegáveis", "cegavam", 
		"ceguei", "cegaste", "cegou", "cegamos", "cegastes", "cegaram", 
		"cegara", "cegaras", "cegara", "cegáramos", "cegáreis", "cegaram", 
		"cegaria", "cegarias", "cegaria", "cegaríamos", "cegaríeis", "cegariam", 
		"cegarei", "cegarás", "cegará", "cegaremos", "cegareis", "cegarão", 
		"cegue", "cegues", "cegue", "ceguemos", "cegueis", "ceguem", 
		"cegasse", "cegasses", "cegasse", "cegássemos", "cegásseis", "cegassem", 
		"cegar", "cegares", "cegar", "cegarmos", "cegardes", "cegarem", 
		null, "cega", "cegue", "ceguemos", "cegai", "ceguem", 
		null, "cegues", "cegue", "ceguemos", "cegueis", "ceguem", 
		"cegar", "cegares", "cegar", "cegarmos", "cegardes", "cegarem", 
	};
	
	final static String cerzir[] = {"cerzir", "cerzindo", "cerzido",
		"cirzo", "cirzes", "cirze", "cerzimos", "cerzis", "cirzem", 
		"cerzia", "cerzias", "cerzia", "cerzíamos", "cerzíeis", "cerziam", 
		"cerzi", "cerziste", "cerziu", "cerzimos", "cerzistes", "cerziram", 
		"cerzira", "cerziras", "cerzira", "cerzíramos", "cerzíreis", "cerziram", 
		"cerziria", "cerzirias", "cerziria", "cerziríamos", "cerziríeis", "cerziriam", 
		"cerzirei", "cerzirás", "cerzirá", "cerziremos", "cerzireis", "cerzirão", 
		"cirza", "cirzas", "cirza", "cirzamos", "cirzais", "cirzam", 
		"cerzisse", "cerzisses", "cerzisse", "cerzíssemos", "cerzísseis", "cerzissem", 
		"cerzir", "cerzires", "cerzir", "cerzirmos", "cerzirdes", "cerzirem", 
		null, "cirze", "cirza", "cirzamos", "cerzi", "cirzam", 
		null, "cirzas", "cirza", "cirzamos", "cirzais", "cirzam", 
		"cerzir", "cerzires", "cerzir", "cerzirmos", "cerzirdes", "cerzirem", 
	};
	
	final static String chegar[] = {"chegar", "chegando", "chegado",
		"chego", "chegas", "chega", "chegamos", "chegais", "chegam", 
		"chegava", "chegavas", "chegava", "chegávamos", "chegáveis", "chegavam", 
		"cheguei", "chegaste", "chegou", "chegamos", "chegastes", "chegaram", 
		"chegara", "chegaras", "chegara", "chegáramos", "chegáreis", "chegaram", 
		"chegaria", "chegarias", "chegaria", "chegaríamos", "chegaríeis", "chegariam", 
		"chegarei", "chegarás", "chegará", "chegaremos", "chegareis", "chegarão", 
		"chegue", "chegues", "chegue", "cheguemos", "chegueis", "cheguem", 
		"chegasse", "chegasses", "chegasse", "chegássemos", "chegásseis", "chegassem", 
		"chegar", "chegares", "chegar", "chegarmos", "chegardes", "chegarem", 
		null, "chega", "chegue", "cheguemos", "chegai", "cheguem", 
		null, "chegues", "chegue", "cheguemos", "chegueis", "cheguem", 
		"chegar", "chegares", "chegar", "chegarmos", "chegardes", "chegarem", 
	};
	
	final static String cobrir[] = {"cobrir", "cobrindo", "coberto",
		"cubro", "cobres", "cobre", "cobrimos", "cobris", "cobrem", 
		"cobria", "cobrias", "cobria", "cobríamos", "cobríeis", "cobriam", 
		"cobri", "cobriste", "cobriu", "cobrimos", "cobristes", "cobriram", 
		"cobrira", "cobriras", "cobrira", "cobríramos", "cobríreis", "cobriram", 
		"cobriria", "cobririas", "cobriria", "cobriríamos", "cobriríeis", "cobririam", 
		"cobrirei", "cobrirás", "cobrirá", "cobriremos", "cobrireis", "cobrirão", 
		"cubra", "cubras", "cubra", "cubramos", "cubrais", "cubram", 
		"cobrisse", "cobrisses", "cobrisse", "cobríssemos", "cobrísseis", "cobrissem", 
		"cobrir", "cobrires", "cobrir", "cobrirmos", "cobrirdes", "cobrirem", 
		null, "cobre", "cubra", "cubramos", "cobri", "cubram", 
		null, "cubras", "cubra", "cubramos", "cubrais", "cubram", 
		"cobrir", "cobrires", "cobrir", "cobrirmos", "cobrirdes", "cobrirem", 
	};
	
	final static String compelir[] = {"compelir", "compelindo", "compelido",
		"compilo", "compeles", "compele", "compelimos", "compelis", "compelem", 
		"compelia", "compelias", "compelia", "compelíamos", "compelíeis", "compeliam", 
		"compeli", "compeliste", "compeliu", "compelimos", "compelistes", "compeliram", 
		"compelira", "compeliras", "compelira", "compelíramos", "compelíreis", "compeliram", 
		"compeliria", "compelirias", "compeliria", "compeliríamos", "compeliríeis", "compeliriam", 
		"compelirei", "compelirás", "compelirá", "compeliremos", "compelireis", "compelirão", 
		"compila", "compilas", "compila", "compilamos", "compilais", "compilam", 
		"compelisse", "compelisses", "compelisse", "compelíssemos", "compelísseis", "compelissem", 
		"compelir", "compelires", "compelir", "compelirmos", "compelirdes", "compelirem", 
		null, "compele", "compila", "compilamos", "compeli", "compilam", 
		null, "compilas", "compila", "compilamos", "compilais", "compilam", 
		"compelir", "compelires", "compelir", "compelirmos", "compelirdes", "compelirem", 
	};
	
	final static String comprazer[] = {"comprazer", "comprazendo", "comprazido",
		"comprazo", "comprazes", "compraz", "comprazemos", "comprazeis", "comprazem", 
		"comprazia", "comprazias", "comprazia", "comprazíamos", "comprazíeis", "compraziam", 
		"comprouve", "comprouveste", "comprouve", "comprouvemos", "comprouvestes", "comprouveram", 
		"comprouvera", "comprouveras", "comprouvera", "comprouvéramos", "comprouvéreis", "comprouveram", 
		"comprazeria", "comprazerias", "comprazeria", "comprazeríamos", "comprazeríeis", "comprazeriam", 
		"comprazerei", "comprazerás", "comprazerá", "comprazeremos", "comprazereis", "comprazerão", 
		"compraza", "comprazas", "compraza", "comprazamos", "comprazais", "comprazam", 
		"comprouvesse", "comprouvesses", "comprouvesse", "comprouvéssemos", "comprouvésseis", "comprouvessem", 
		"comprouver", "comprouveres", "comprouver", "comprouvermos", "comprouverdes", "comprouverem", 
		null, "compraze", "compraza", "comprazamos", "comprazei", "comprazam", 
		null, "comprazas", "compraza", "comprazamos", "comprazais", "comprazam", 
		"comprazer", "comprazeres", "comprazer", "comprazermos", "comprazerdes", "comprazerem", 
	};
	
	final static String comunicar[] = {"comunicar", "comunicando", "comunicado",
		"comunico", "comunicas", "comunica", "comunicamos", "comunicais", "comunicam", 
		"comunicava", "comunicavas", "comunicava", "comunicávamos", "comunicáveis", "comunicavam", 
		"comuniquei", "comunicaste", "comunicou", "comunicamos", "comunicastes", "comunicaram", 
		"comunicara", "comunicaras", "comunicara", "comunicáramos", "comunicáreis", "comunicaram", 
		"comunicaria", "comunicarias", "comunicaria", "comunicaríamos", "comunicaríeis", "comunicariam", 
		"comunicarei", "comunicarás", "comunicará", "comunicaremos", "comunicareis", "comunicarão", 
		"comunique", "comuniques", "comunique", "comuniquemos", "comuniqueis", "comuniquem", 
		"comunicasse", "comunicasses", "comunicasse", "comunicássemos", "comunicásseis", "comunicassem", 
		"comunicar", "comunicares", "comunicar", "comunicarmos", "comunicardes", "comunicarem", 
		null, "comunica", "comunique", "comuniquemos", "comunicai", "comuniquem", 
		null, "comuniques", "comunique", "comuniquemos", "comuniqueis", "comuniquem", 
		"comunicar", "comunicares", "comunicar", "comunicarmos", "comunicardes", "comunicarem", 
	};
	
	final static String concernir[] = {"concernir", "concernindo", "concernido",
		null, null, "concerne", null, null, "concernem",
		null, null, "concernia", null, null, "concerniam",
		null, null, "concerniu", null, null, "concerniram",
		null, null, "concernira", null, null, "concerniram",
		null, null, "concerniria", null, null, "concerniriam",
		null, null, "concernirá", null, null, "concernirão",
		null, null, "concerna", null, null, "concernam",
		null, null, "concernisse", null, null, "concernissem",
		null, null, "concernir", null, null, "concernirem",
		null, null, null, null, null, null, 
		null, null, null, null, null, null, 
		null, null, "concernir", null, null, "concernirem"
	};
	
	final static String conhecer[] = {"conhecer", "conhecendo", "conhecido",
		"conheço", "conheces", "conhece", "conhecemos", "conheceis", "conhecem", 
		"conhecia", "conhecias", "conhecia", "conhecíamos", "conhecíeis", "conheciam", 
		"conheci", "conheceste", "conheceu", "conhecemos", "conhecestes", "conheceram", 
		"conhecera", "conheceras", "conhecera", "conhecêramos", "conhecêreis", "conheceram", 
		"conheceria", "conhecerias", "conheceria", "conheceríamos", "conheceríeis", "conheceriam", 
		"conhecerei", "conhecerás", "conhecerá", "conheceremos", "conhecereis", "conhecerão", 
		"conheça", "conheças", "conheça", "conheçamos", "conheçais", "conheçam", 
		"conhecesse", "conhecesses", "conhecesse", "conhecêssemos", "conhecêsseis", "conhecessem", 
		"conhecer", "conheceres", "conhecer", "conhecermos", "conhecerdes", "conhecerem", 
		null, "conhece", "conheça", "conheçamos", "conhecei", "conheçam", 
		null, "conheças", "conheça", "conheçamos", "conheçais", "conheçam", 
		"conhecer", "conheceres", "conhecer", "conhecermos", "conhecerdes", "conhecerem", 
	};
	
	final static String construir[] = {"construir", "construindo", "construído",
		"construo", "constróis", "constrói", "construímos", "construís", "constroem", 
		"construía", "construías", "construía", "construíamos", "construíeis", "construíam", 
		"construí", "construíste", "construiu", "construímos", "construístes", "construíram", 
		"construíra", "construíras", "construíra", "construíramos", "construíreis", "construíram", 
		"construiria", "construirias", "construiria", "construiríamos", "construiríeis", "construiriam", 
		"construirei", "construirás", "construirá", "construiremos", "construireis", "construirão", 
		"construa", "construas", "construa", "construamos", "construais", "construam", 
		"construísse", "construísses", "construísse", "construíssemos", "construísseis", "construíssem", 
		"construir", "construíres", "construir", "construirmos", "construirdes", "construírem", 
		null, "constrói", "construa", "construamos", "construí", "construam", 
		null, "construas", "construa", "construamos", "construais", "construam", 
		"construir", "construíres", "construir", "construirmos", "construirdes", "construírem", 
	};
	
	final static String conter[] = {"conter", "contendo", "contido",
		"contenho", "conténs", "contém", "contemos", "contendes", "contêm", 
		"continha", "continhas", "continha", "contínhamos", "contínheis", "continham", 
		"contive", "contiveste", "conteve", "contivemos", "contivestes", "contiveram", 
		"contivera", "contiveras", "contivera", "contivéramos", "contivéreis", "contiveram", 
		"conteria", "conterias", "conteria", "conteríamos", "conteríeis", "conteriam", 
		"conterei", "conterás", "conterá", "conteremos", "contereis", "conterão", 
		"contenha", "contenhas", "contenha", "contenhamos", "contenhais", "contenham", 
		"contivesse", "contivesses", "contivesse", "contivéssemos", "contivésseis", "contivessem", 
		"contiver", "contiveres", "contiver", "contivermos", "contiverdes", "contiverem", 
		null, "contém", "contenha", "contenhamos", "contende", "contenham", 
		null, "contenhas", "contenha", "contenhamos", "contenhais", "contenham", 
		"conter", "conteres", "conter", "contermos", "conterdes", "conterem", 
	};
	
	final static String convergir[] = {"convergir", "convergindo", "convergido",
		"convirjo", "converges", "converge", "convergimos", "convergis", "convergem", 
		"convergia", "convergias", "convergia", "convergíamos", "convergíeis", "convergiam", 
		"convergi", "convergiste", "convergiu", "convergimos", "convergistes", "convergiram", 
		"convergira", "convergiras", "convergira", "convergíramos", "convergíreis", "convergiram", 
		"convergiria", "convergirias", "convergiria", "convergiríamos", "convergiríeis", "convergiriam", 
		"convergirei", "convergirás", "convergirá", "convergiremos", "convergireis", "convergirão", 
		"convirja", "convirjas", "convirja", "convirjamos", "convirjais", "convirjam", 
		"convergisse", "convergisses", "convergisse", "convergíssemos", "convergísseis", "convergissem", 
		"convergir", "convergires", "convergir", "convergirmos", "convergirdes", "convergirem", 
		null, "converge", "convirja", "convirjamos", "convergi", "convirjam", 
		null, "convirjas", "convirja", "convirjamos", "convirjais", "convirjam", 
		"convergir", "convergires", "convergir", "convergirmos", "convergirdes", "convergirem", 
	};
	
	final static String crer[] = {"crer", "crendo", "crido",
		"creio", "crês", "crê", "cremos", "credes", "crêem", 
		"cria", "crias", "cria", "críamos", "críeis", "criam", 
		"cri", "creste", "creu", "cremos", "crestes", "creram", 
		"crera", "creras", "crera", "crêramos", "crêreis", "creram", 
		"creria", "crerias", "creria", "creríamos", "creríeis", "creriam", 
		"crerei", "crerás", "crerá", "creremos", "crereis", "crerão", 
		"creia", "creias", "creia", "creiamos", "creiais", "creiam", 
		"cresse", "cresses", "cresse", "crêssemos", "crêsseis", "cressem", 
		"crer", "creres", "crer", "crermos", "crerdes", "crerem", 
		null, "crê", "creia", "creiamos", "crede", "creiam", 
		null, "creias", "creia", "creiamos", "creiais", "creiam", 
		"crer", "creres", "crer", "crermos", "crerdes", "crerem", 
	};
	
	final static String cuspir[] = {"cuspir", "cuspindo", "cuspido",
		"cuspo", "cospes", "cospe", "cuspimos", "cuspis", "cospem", 
		"cuspia", "cuspias", "cuspia", "cuspíamos", "cuspíeis", "cuspiam", 
		"cuspi", "cuspiste", "cuspiu", "cuspimos", "cuspistes", "cuspiram", 
		"cuspira", "cuspiras", "cuspira", "cuspíramos", "cuspíreis", "cuspiram", 
		"cuspiria", "cuspirias", "cuspiria", "cuspiríamos", "cuspiríeis", "cuspiriam", 
		"cuspirei", "cuspirás", "cuspirá", "cuspiremos", "cuspireis", "cuspirão", 
		"cuspa", "cuspas", "cuspa", "cuspamos", "cuspais", "cuspam", 
		"cuspisse", "cuspisses", "cuspisse", "cuspíssemos", "cuspísseis", "cuspissem", 
		"cuspir", "cuspires", "cuspir", "cuspirmos", "cuspirdes", "cuspirem", 
		null, "cospe", "cuspa", "cuspamos", "cuspi", "cuspam", 
		null, "cuspas", "cuspa", "cuspamos", "cuspais", "cuspam", 
		"cuspir", "cuspires", "cuspir", "cuspirmos", "cuspirdes", "cuspirem", 
	};
	
	final static String denegrir[] = {"denegrir", "denegrindo", "denegrido",
		"denigro", "denigres", "denigre", "denegrimos", "denegris", "denigrem", 
		"denegria", "denegrias", "denegria", "denegríamos", "denegríeis", "denegriam", 
		"denegri", "denegriste", "denegriu", "denegrimos", "denegristes", "denegriram", 
		"denegrira", "denegriras", "denegrira", "denegríramos", "denegríreis", "denegriram", 
		"denegriria", "denegririas", "denegriria", "denegriríamos", "denegriríeis", "denegririam", 
		"denegrirei", "denegrirás", "denegrirá", "denegriremos", "denegrireis", "denegrirão", 
		"denigra", "denigras", "denigra", "denigramos", "denigrais", "denigram", 
		"denegrisse", "denegrisses", "denegrisse", "denegríssemos", "denegrísseis", "denegrissem", 
		"denegrir", "denegrires", "denegrir", "denegrirmos", "denegrirdes", "denegrirem", 
		null, "denigre", "denigra", "denigramos", "denegri", "denigram", 
		null, "denigras", "denigra", "denigramos", "denigrais", "denigram", 
		"denegrir", "denegrires", "denegrir", "denegrirmos", "denegrirdes", "denegrirem", 
	};
	
	final static String dizer[] = {"dizer", "dizendo", "dito",
		"digo", "dizes", "diz", "dizemos", "dizeis", "dizem", 
		"dizia", "dizias", "dizia", "dizíamos", "dizíeis", "diziam", 
		"disse", "disseste", "disse", "dissemos", "dissestes", "disseram", 
		"dissera", "disseras", "dissera", "disséramos", "disséreis", "disseram", 
		"diria", "dirias", "diria", "diríamos", "diríeis", "diriam", 
		"direi", "dirás", "dirá", "diremos", "direis", "dirão", 
		"diga", "digas", "diga", "digamos", "digais", "digam", 
		"dissesse", "dissesses", "dissesse", "disséssemos", "dissésseis", "dissessem", 
		"disser", "disseres", "disser", "dissermos", "disserdes", "disserem", 
		null, "dize", "diga", "digamos", "dizei", "digam", 
		null, "digas", "diga", "digamos", "digais", "digam", 
		"dizer", "dizeres", "dizer", "dizermos", "dizerdes", "dizerem", 
	};
	final static String doer[] = {"doer", "doendo", "doído",
		"dôo", "dóis", "dói", "doemos", "doeis", "doem", 
		"doía", "doías", "doía", "doíamos", "doíeis", "doíam", 
		"doí", "doeste", "doeu", "doemos", "doestes", "doeram", 
		"doera", "doeras", "doera", "doêramos", "doêreis", "doeram", 
		"doeria", "doerias", "doeria", "doeríamos", "doeríeis", "doeriam", 
		"doerei", "doerás", "doerá", "doeremos", "doereis", "doerão", 
		"doa", "doas", "doa", "doamos", "doais", "doam", 
		"doesse", "doesses", "doesse", "doêssemos", "doêsseis", "doessem", 
		"doer", "doeres", "doer", "doermos", "doerdes", "doerem", 
		null, "dói", "doa", "doamos", "doei", "doam", 
		null, "doas", "doa", "doamos", "doais", "doam", 
		"doer", "doeres", "doer", "doermos", "doerdes", "doerem", 
	};
	
	final static String dormir[] = {"dormir", "dormindo", "dormido",
		"durmo", "dormes", "dorme", "dormimos", "dormis", "dormem", 
		"dormia", "dormias", "dormia", "dormíamos", "dormíeis", "dormiam", 
		"dormi", "dormiste", "dormiu", "dormimos", "dormistes", "dormiram", 
		"dormira", "dormiras", "dormira", "dormíramos", "dormíreis", "dormiram", 
		"dormiria", "dormirias", "dormiria", "dormiríamos", "dormiríeis", "dormiriam", 
		"dormirei", "dormirás", "dormirá", "dormiremos", "dormireis", "dormirão", 
		"durma", "durmas", "durma", "durmamos", "durmais", "durmam", 
		"dormisse", "dormisses", "dormisse", "dormíssemos", "dormísseis", "dormissem", 
		"dormir", "dormires", "dormir", "dormirmos", "dormirdes", "dormirem", 
		null, "dorme", "durma", "durmamos", "dormi", "durmam", 
		null, "durmas", "durma", "durmamos", "durmais", "durmam", 
		"dormir", "dormires", "dormir", "dormirmos", "dormirdes", "dormirem", 
	};

	final static String embair[] = {"embair", "embaindo", "embaído",
		null, null, null, "embaímos", "embaís", null, 
		"embaía", "embaías", "embaía", "embaíamos", "embaíeis", "embaíam", 
		"embaí", "embaíste", "embaiu", "embaímos", "embaístes", "embaíram", 
		"embaíra", "embaíras", "embaíra", "embaíramos", "embaíreis", "embaíram", 
		"embairia", "embairias", "embairia", "embairíamos", "embairíeis", "embairiam", 
		"embairei", "embairás", "embairá", "embairemos", "embaireis", "embairão", 
		null, null, null, null, null, null, 
		"embaísse", "embaísses", "embaísse", "embaíssemos", "embaísseis", "embaíssem", 
		"embair", "embaíres", "embair", "embairmos", "embairdes", "embaírem", 
		null, null, null, null, "embaí", null, 
		null, null, null, null, null, null, 
		"embair", "embaíres", "embair", "embairmos", "embairdes", "embaírem", 
	};
	
	final static String engolir[] = {"engolir", "engolindo", "engolido",
		"engulo", "engoles", "engole", "engolimos", "engolis", "engolem", 
		"engolia", "engolias", "engolia", "engolíamos", "engolíeis", "engoliam", 
		"engoli", "engoliste", "engoliu", "engolimos", "engolistes", "engoliram", 
		"engolira", "engoliras", "engolira", "engolíramos", "engolíreis", "engoliram", 
		"engoliria", "engolirias", "engoliria", "engoliríamos", "engoliríeis", "engoliriam", 
		"engolirei", "engolirás", "engolirá", "engoliremos", "engolireis", "engolirão", 
		"engula", "engulas", "engula", "engulamos", "engulais", "engulam", 
		"engolisse", "engolisses", "engolisse", "engolíssemos", "engolísseis", "engolissem", 
		"engolir", "engolires", "engolir", "engolirmos", "engolirdes", "engolirem", 
		null, "engole", "engula", "engulamos", "engoli", "engulam", 
		null, "engulas", "engula", "engulamos", "engulais", "engulam", 
		"engolir", "engolires", "engolir", "engolirmos", "engolirdes", "engolirem", 
	};
	
	final static String enraizar[] = {"enraizar", "enraizando", "enraizado",
		"enraízo", "enraízas", "enraíza", "enraizamos", "enraizais", "enraízam", 
		"enraizava", "enraizavas", "enraizava", "enraizávamos", "enraizáveis", "enraizavam", 
		"enraizei", "enraizaste", "enraizou", "enraizamos", "enraizastes", "enraizaram", 
		"enraizara", "enraizaras", "enraizara", "enraizáramos", "enraizáreis", "enraizaram", 
		"enraizaria", "enraizarias", "enraizaria", "enraizaríamos", "enraizaríeis", "enraizariam", 
		"enraizarei", "enraizarás", "enraizará", "enraizaremos", "enraizareis", "enraizarão", 
		"enraíze", "enraízes", "enraíze", "enraizemos", "enraizeis", "enraízem", 
		"enraizasse", "enraizasses", "enraizasse", "enraizássemos", "enraizásseis", "enraizassem", 
		"enraizar", "enraizares", "enraizar", "enraizarmos", "enraizardes", "enraizarem", 
		null, "enraíza", "enraíze", "enraizemos", "enraizai", "enraízem", 
		null, "enraízes", "enraíze", "enraizemos", "enraizeis", "enraízem", 
		"enraizar", "enraizares", "enraizar", "enraizarmos", "enraizardes", "enraizarem", 
	};
	
	final static String entupir[] = {"entupir", "entupindo", "entupido",
		"entupo", "entopes", "entope", "entupimos", "entupis", "entopem", 
		"entupia", "entupias", "entupia", "entupíamos", "entupíeis", "entupiam", 
		"entupi", "entupiste", "entupiu", "entupimos", "entupistes", "entupiram", 
		"entupira", "entupiras", "entupira", "entupíramos", "entupíreis", "entupiram", 
		"entupiria", "entupirias", "entupiria", "entupiríamos", "entupiríeis", "entupiriam", 
		"entupirei", "entupirás", "entupirá", "entupiremos", "entupireis", "entupirão", 
		"entupa", "entupas", "entupa", "entupamos", "entupais", "entupam", 
		"entupisse", "entupisses", "entupisse", "entupíssemos", "entupísseis", "entupissem", 
		"entupir", "entupires", "entupir", "entupirmos", "entupirdes", "entupirem", 
		null, "entope", "entupa", "entupamos", "entupi", "entupam", 
		null, "entupas", "entupa", "entupamos", "entupais", "entupam", 
		"entupir", "entupires", "entupir", "entupirmos", "entupirdes", "entupirem", 
	};
	
	final static String enviuvar[] = {"enviuvar", "enviuvando", "enviuvado",
		"enviúvo", "enviúvas", "enviúva", "enviuvamos", "enviuvais", "enviúvam", 
		"enviuvava", "enviuvavas", "enviuvava", "enviuvávamos", "enviuváveis", "enviuvavam", 
		"enviuvei", "enviuvaste", "enviuvou", "enviuvamos", "enviuvastes", "enviuvaram", 
		"enviuvara", "enviuvaras", "enviuvara", "enviuváramos", "enviuváreis", "enviuvaram", 
		"enviuvaria", "enviuvarias", "enviuvaria", "enviuvaríamos", "enviuvaríeis", "enviuvariam", 
		"enviuvarei", "enviuvarás", "enviuvará", "enviuvaremos", "enviuvareis", "enviuvarão", 
		"enviúve", "enviúves", "enviúve", "enviuvemos", "enviuveis", "enviúvem", 
		"enviuvasse", "enviuvasses", "enviuvasse", "enviuvássemos", "enviuvásseis", "enviuvassem", 
		"enviuvar", "enviuvares", "enviuvar", "enviuvarmos", "enviuvardes", "enviuvarem", 
		null, "enviúva", "enviúve", "enviuvemos", "enviuvai", "enviúvem", 
		null, "enviúves", "enviúve", "enviuvemos", "enviuveis", "enviúvem", 
		"enviuvar", "enviuvares", "enviuvar", "enviuvarmos", "enviuvardes", "enviuvarem", 
	};
	
	final static String erguer[] = {"erguer", "erguendo", "erguido",
		"ergo", "ergues", "ergue", "erguemos", "ergueis", "erguem", 
		"erguia", "erguias", "erguia", "erguíamos", "erguíeis", "erguiam", 
		"ergui", "ergueste", "ergueu", "erguemos", "erguestes", "ergueram", 
		"erguera", "ergueras", "erguera", "erguêramos", "erguêreis", "ergueram", 
		"ergueria", "erguerias", "ergueria", "ergueríamos", "ergueríeis", "ergueriam", 
		"erguerei", "erguerás", "erguerá", "ergueremos", "erguereis", "erguerão", 
		"erga", "ergas", "erga", "ergamos", "ergais", "ergam", 
		"erguesse", "erguesses", "erguesse", "erguêssemos", "erguêsseis", "erguessem", 
		"erguer", "ergueres", "erguer", "erguermos", "erguerdes", "erguerem", 
		null, "ergue", "erga", "ergamos", "erguei", "ergam", 
		null, "ergas", "erga", "ergamos", "ergais", "ergam", 
		"erguer", "ergueres", "erguer", "erguermos", "erguerdes", "erguerem", 
	};
	
	final static String escapulir[] = {"escapulir", "escapulindo", "escapulido",
		"escapulo", "escapoles", "escapole", "escapulimos", "escapulis", "escapolem", 
		"escapulia", "escapulias", "escapulia", "escapulíamos", "escapulíeis", "escapuliam", 
		"escapuli", "escapuliste", "escapuliu", "escapulimos", "escapulistes", "escapuliram", 
		"escapulira", "escapuliras", "escapulira", "escapulíramos", "escapulíreis", "escapuliram", 
		"escapuliria", "escapulirias", "escapuliria", "escapuliríamos", "escapuliríeis", "escapuliriam", 
		"escapulirei", "escapulirás", "escapulirá", "escapuliremos", "escapulireis", "escapulirão", 
		"escapula", "escapulas", "escapula", "escapulamos", "escapulais", "escapulam", 
		"escapulisse", "escapulisses", "escapulisse", "escapulíssemos", "escapulísseis", "escapulissem", 
		"escapulir", "escapulires", "escapulir", "escapulirmos", "escapulirdes", "escapulirem", 
		null, "escapole", "escapula", "escapulamos", "escapuli", "escapulam", 
		null, "escapulas", "escapula", "escapulamos", "escapulais", "escapulam", 
		"escapulir", "escapulires", "escapulir", "escapulirmos", "escapulirdes", "escapulirem", 
	};
	
	final static String escrever[] = {"escrever", "escrevendo", "escrito",
		"escrevo", "escreves", "escreve", "escrevemos", "escreveis", "escrevem", 
		"escrevia", "escrevias", "escrevia", "escrevíamos", "escrevíeis", "escreviam", 
		"escrevi", "escreveste", "escreveu", "escrevemos", "escrevestes", "escreveram", 
		"escrevera", "escreveras", "escrevera", "escrevêramos", "escrevêreis", "escreveram", 
		"escreveria", "escreverias", "escreveria", "escreveríamos", "escreveríeis", "escreveriam", 
		"escreverei", "escreverás", "escreverá", "escreveremos", "escrevereis", "escreverão", 
		"escreva", "escrevas", "escreva", "escrevamos", "escrevais", "escrevam", 
		"escrevesse", "escrevesses", "escrevesse", "escrevêssemos", "escrevêsseis", "escrevessem", 
		"escrever", "escreveres", "escrever", "escrevermos", "escreverdes", "escreverem", 
		null, "escreve", "escreva", "escrevamos", "escrevei", "escrevam", 
		null, "escrevas", "escreva", "escrevamos", "escrevais", "escrevam", 
		"escrever", "escreveres", "escrever", "escrevermos", "escreverdes", "escreverem", 
	};
	
	final static String esmiucar[] = {"esmiuçar", "esmiuçando", "esmiuçado",
		"esmiúço", "esmiúças", "esmiúça", "esmiuçamos", "esmiuçais", "esmiúçam", 
		"esmiuçava", "esmiuçavas", "esmiuçava", "esmiuçávamos", "esmiuçáveis", "esmiuçavam", 
		"esmiucei", "esmiuçaste", "esmiuçou", "esmiuçamos", "esmiuçastes", "esmiuçaram", 
		"esmiuçara", "esmiuçaras", "esmiuçara", "esmiuçáramos", "esmiuçáreis", "esmiuçaram", 
		"esmiuçaria", "esmiuçarias", "esmiuçaria", "esmiuçaríamos", "esmiuçaríeis", "esmiuçariam", 
		"esmiuçarei", "esmiuçarás", "esmiuçará", "esmiuçaremos", "esmiuçareis", "esmiuçarão", 
		"esmiúce", "esmiúces", "esmiúce", "esmiucemos", "esmiuceis", "esmiúcem", 
		"esmiuçasse", "esmiuçasses", "esmiuçasse", "esmiuçássemos", "esmiuçásseis", "esmiuçassem", 
		"esmiuçar", "esmiuçares", "esmiuçar", "esmiuçarmos", "esmiuçardes", "esmiuçarem", 
		null, "esmiúça", "esmiúce", "esmiucemos", "esmiuçai", "esmiúcem", 
		null, "esmiúces", "esmiúce", "esmiucemos", "esmiuceis", "esmiúcem", 
		"esmiuçar", "esmiuçares", "esmiuçar", "esmiuçarmos", "esmiuçardes", "esmiuçarem", 
	};
	
	final static String espargir[] = {"espargir", "espargindo", "espargido",
		"esparjo", "esparges", "esparge", "espargimos", "espargis", "espargem", 
		"espargia", "espargias", "espargia", "espargíamos", "espargíeis", "espargiam", 
		"espargi", "espargiste", "espargiu", "espargimos", "espargistes", "espargiram", 
		"espargira", "espargiras", "espargira", "espargíramos", "espargíreis", "espargiram", 
		"espargiria", "espargirias", "espargiria", "espargiríamos", "espargiríeis", "espargiriam", 
		"espargirei", "espargirás", "espargirá", "espargiremos", "espargireis", "espargirão", 
		"esparja", "esparjas", "esparja", "esparjamos", "esparjais", "esparjam", 
		"espargisse", "espargisses", "espargisse", "espargíssemos", "espargísseis", "espargissem", 
		"espargir", "espargires", "espargir", "espargirmos", "espargirdes", "espargirem", 
		null, "esparge", "esparja", "esparjamos", "espargi", "esparjam", 
		null, "esparjas", "esparja", "esparjamos", "esparjais", "esparjam", 
		"espargir", "espargires", "espargir", "espargirmos", "espargirdes", "espargirem", 
	};
	
	final static String estar[] = {"estar", "estando", "estado",
		"estou", "estás", "está", "estamos", "estais", "estão", 
		"estava", "estavas", "estava", "estávamos", "estáveis", "estavam", 
		"estive", "estiveste", "esteve", "estivemos", "estivestes", "estiveram", 
		"estivera", "estiveras", "estivera", "estivéramos", "estivéreis", "estiveram", 
		"estaria", "estarias", "estaria", "estaríamos", "estaríeis", "estariam", 
		"estarei", "estarás", "estará", "estaremos", "estareis", "estarão", 
		"esteja", "estejas", "esteja", "estejamos", "estejais", "estejam", 
		"estivesse", "estivesses", "estivesse", "estivéssemos", "estivésseis", "estivessem", 
		"estiver", "estiveres", "estiver", "estivermos", "estiverdes", "estiverem", 
		null, "está", "esteja", "estejamos", "estai", "estejam", 
		null, "estejas", "esteja", "estejamos", "estejais", "estejam", 
		"estar", "estares", "estar", "estarmos", "estardes", "estarem", 
	};
	
	final static String estrear[] = {"estrear", "estreando", "estreado",
		"estréio", "estréias", "estréia", "estreamos", "estreais", "estréiam", 
		"estreava", "estreavas", "estreava", "estreávamos", "estreáveis", "estreavam", 
		"estreei", "estreaste", "estreou", "estreamos", "estreastes", "estrearam", 
		"estreara", "estrearas", "estreara", "estreáramos", "estreáreis", "estrearam", 
		"estrearia", "estrearias", "estrearia", "estrearíamos", "estrearíeis", "estreariam", 
		"estrearei", "estrearás", "estreará", "estrearemos", "estreareis", "estrearão", 
		"estréie", "estréies", "estréie", "estreemos", "estreeis", "estréiem", 
		"estreasse", "estreasses", "estreasse", "estreássemos", "estreásseis", "estreassem", 
		"estrear", "estreares", "estrear", "estrearmos", "estreardes", "estrearem", 
		null, "estréia", "estréie", "estreemos", "estreai", "estréiem", 
		null, "estréies", "estréie", "estreemos", "estreeis", "estréiem", 
		"estrear", "estreares", "estrear", "estrearmos", "estreardes", "estrearem", 
	};
	
	final static String extinguir[] = {"extinguir", "extinguindo", "extinguido,extinto",
		"extingo", "extingues", "extingue", "extinguimos", "extinguis", "extinguem", 
		"extinguia", "extinguias", "extinguia", "extinguíamos", "extinguíeis", "extinguiam", 
		"extingui", "extinguiste", "extinguiu", "extinguimos", "extinguistes", "extinguiram", 
		"extinguira", "extinguiras", "extinguira", "extinguíramos", "extinguíreis", "extinguiram", 
		"extinguiria", "extinguirias", "extinguiria", "extinguiríamos", "extinguiríeis", "extinguiriam", 
		"extinguirei", "extinguirás", "extinguirá", "extinguiremos", "extinguireis", "extinguirão", 
		"extinga", "extingas", "extinga", "extingamos", "extingais", "extingam", 
		"extinguisse", "extinguisses", "extinguisse", "extinguíssemos", "extinguísseis", "extinguissem", 
		"extinguir", "extinguires", "extinguir", "extinguirmos", "extinguirdes", "extinguirem", 
		null, "extingue", "extinga", "extingamos", "extingui", "extingam", 
		null, "extingas", "extinga", "extingamos", "extingais", "extingam", 
		"extinguir", "extinguires", "extinguir", "extinguirmos", "extinguirdes", "extinguirem", 
	};
	
	final static String faiscar[] = {"faiscar", "faiscando", "faiscado",
		"faísco", "faíscas", "faísca", "faiscamos", "faiscais", "faíscam", 
		"faiscava", "faiscavas", "faiscava", "faiscávamos", "faiscáveis", "faiscavam", 
		"faisquei", "faiscaste", "faiscou", "faiscamos", "faiscastes", "faiscaram", 
		"faiscara", "faiscaras", "faiscara", "faiscáramos", "faiscáreis", "faiscaram", 
		"faiscaria", "faiscarias", "faiscaria", "faiscaríamos", "faiscaríeis", "faiscariam", 
		"faiscarei", "faiscarás", "faiscará", "faiscaremos", "faiscareis", "faiscarão", 
		"faísque", "faísques", "faísque", "faisquemos", "faisqueis", "faísquem", 
		"faiscasse", "faiscasses", "faiscasse", "faiscássemos", "faiscásseis", "faiscassem", 
		"faiscar", "faiscares", "faiscar", "faiscarmos", "faiscardes", "faiscarem", 
		null, "faísca", "faísque", "faisquemos", "faiscai", "faísquem", 
		null, "faísques", "faísque", "faisquemos", "faisqueis", "faísquem", 
		"faiscar", "faiscares", "faiscar", "faiscarmos", "faiscardes", "faiscarem", 
	};
	
	final static String fazer[] = {"fazer", "fazendo", "feito",
		"faço", "fazes", "faz", "fazemos", "fazeis", "fazem", 
		"fazia", "fazias", "fazia", "fazíamos", "fazíeis", "faziam", 
		"fiz", "fizeste", "fez", "fizemos", "fizestes", "fizeram", 
		"fizera", "fizeras", "fizera", "fizéramos", "fizéreis", "fizeram", 
		"faria", "farias", "faria", "faríamos", "faríeis", "fariam", 
		"farei", "farás", "fará", "faremos", "fareis", "farão", 
		"faça", "faças", "faça", "façamos", "façais", "façam", 
		"fizesse", "fizesses", "fizesse", "fizéssemos", "fizésseis", "fizessem", 
		"fizer", "fizeres", "fizer", "fizermos", "fizerdes", "fizerem", 
		null, "faze", "faça", "façamos", "fazei", "façam", 
		null, "faças", "faça", "façamos", "façais", "façam", 
		"fazer", "fazeres", "fazer", "fazermos", "fazerdes", "fazerem", 
	};
	
	final static String feder[] = {"feder", "fedendo", "fedido",
		"fedo", "fedes", "fede", "fedemos", "fedeis", "fedem", 
		"fedia", "fedias", "fedia", "fedíamos", "fedíeis", "fediam", 
		"fedi", "fedeste", "fedeu", "fedemos", "fedestes", "federam", 
		"federa", "federas", "federa", "fedêramos", "fedêreis", "federam", 
		"federia", "federias", "federia", "federíamos", "federíeis", "federiam", 
		"federei", "federás", "federá", "federemos", "federeis", "federão", 
		"feda", "fedas", "feda", "fedamos", "fedais", "fedam", 
		"fedesse", "fedesses", "fedesse", "fedêssemos", "fedêsseis", "fedessem", 
		"feder", "federes", "feder", "federmos", "federdes", "federem", 
		null, "fede", "feda", "fedamos", "fedei", "fedam", 
		null, "fedas", "feda", "fedamos", "fedais", "fedam", 
		"feder", "federes", "feder", "federmos", "federdes", "federem", 
	};
	
	final static String ferir[] = {"ferir", "ferindo", "ferido",
		"firo", "feres", "fere", "ferimos", "feris", "ferem", 
		"feria", "ferias", "feria", "feríamos", "feríeis", "feriam", 
		"feri", "feriste", "feriu", "ferimos", "feristes", "feriram", 
		"ferira", "feriras", "ferira", "feríramos", "feríreis", "feriram", 
		"feriria", "feririas", "feriria", "feriríamos", "feriríeis", "feririam", 
		"ferirei", "ferirás", "ferirá", "feriremos", "ferireis", "ferirão", 
		"fira", "firas", "fira", "firamos", "firais", "firam", 
		"ferisse", "ferisses", "ferisse", "feríssemos", "ferísseis", "ferissem", 
		"ferir", "ferires", "ferir", "ferirmos", "ferirdes", "ferirem", 
		null, "fere", "fira", "firamos", "feri", "firam", 
		null, "firas", "fira", "firamos", "firais", "firam", 
		"ferir", "ferires", "ferir", "ferirmos", "ferirdes", "ferirem", 
	};
	
	final static String frigir[] = {"frigir", "frigindo", "frigido,frito",
		"frijo", "freges", "frege", "frigimos", "frigis", "fregem", 
		"frigia", "frigias", "frigia", "frigíamos", "frigíeis", "frigiam", 
		"frigi", "frigiste", "frigiu", "frigimos", "frigistes", "frigiram", 
		"frigira", "frigiras", "frigira", "frigíramos", "frigíreis", "frigiram", 
		"frigiria", "frigirias", "frigiria", "frigiríamos", "frigiríeis", "frigiriam", 
		"frigirei", "frigirás", "frigirá", "frigiremos", "frigireis", "frigirão", 
		"frija", "frijas", "frija", "frijamos", "frijais", "frijam", 
		"frigisse", "frigisses", "frigisse", "frigíssemos", "frigísseis", "frigissem", 
		"frigir", "frigires", "frigir", "frigirmos", "frigirdes", "frigirem", 
		null, "frege", "frija", "frijamos", "frigi", "frijam", 
		null, "frijas", "frija", "frijamos", "frijais", "frijam", 
		"frigir", "frigires", "frigir", "frigirmos", "frigirdes", "frigirem", 
	};

	final static String fugir[] = {"fugir", "fugindo", "fugido",
		"fujo", "foges", "foge", "fugimos", "fugis", "fogem", 
		"fugia", "fugias", "fugia", "fugíamos", "fugíeis", "fugiam", 
		"fugi", "fugiste", "fugiu", "fugimos", "fugistes", "fugiram", 
		"fugira", "fugiras", "fugira", "fugíramos", "fugíreis", "fugiram", 
		"fugiria", "fugirias", "fugiria", "fugiríamos", "fugiríeis", "fugiriam", 
		"fugirei", "fugirás", "fugirá", "fugiremos", "fugireis", "fugirão", 
		"fuja", "fujas", "fuja", "fujamos", "fujais", "fujam", 
		"fugisse", "fugisses", "fugisse", "fugíssemos", "fugísseis", "fugissem", 
		"fugir", "fugires", "fugir", "fugirmos", "fugirdes", "fugirem", 
		null, "foge", "fuja", "fujamos", "fugi", "fujam", 
		null, "fujas", "fuja", "fujamos", "fujais", "fujam", 
		"fugir", "fugires", "fugir", "fugirmos", "fugirdes", "fugirem", 
	};

	final static String haver[] = {"haver", "havendo", "havido",
		"hei", "hás", "há", "havemos", "haveis", "hão", 
		"havia", "havias", "havia", "havíamos", "havíeis", "haviam", 
		"houve", "houveste", "houve", "houvemos", "houvestes", "houveram", 
		"houvera", "houveras", "houvera", "houvéramos", "houvéreis", "houveram", 
		"haveria", "haverias", "haveria", "haveríamos", "haveríeis", "haveriam", 
		"haverei", "haverás", "haverá", "haveremos", "havereis", "haverão", 
		"haja", "hajas", "haja", "hajamos", "hajais", "hajam", 
		"houvesse", "houvesses", "houvesse", "houvéssemos", "houvésseis", "houvessem", 
		"houver", "houveres", "houver", "houvermos", "houverdes", "houverem", 
		null, "haja", "hajamos", "havei", "hajam", "hajas", 
		null, "haja", "hajamos", "hajais", "hajam", "haver", 
		"haveres", "haver", "havermos", "haverdes", "haverem", 
	};

	final static String inquerir[] = {"inquerir", "inquerindo", "inquerido",
		"inquiro", "inqueres", "inquere", "inquerimos", "inqueris", "inquerem", 
		"inqueria", "inquerias", "inqueria", "inqueríamos", "inqueríeis", "inqueriam", 
		"inqueri", "inqueriste", "inqueriu", "inquerimos", "inqueristes", "inqueriram", 
		"inquerira", "inqueriras", "inquerira", "inqueríramos", "inqueríreis", "inqueriram", 
		"inqueriria", "inqueririas", "inqueriria", "inqueriríamos", "inqueriríeis", "inqueririam", 
		"inquerirei", "inquerirás", "inquerirá", "inqueriremos", "inquerireis", "inquerirão", 
		"inquira", "inquiras", "inquira", "inquiramos", "inquirais", "inquiram", 
		"inquerisse", "inquerisses", "inquerisse", "inqueríssemos", "inquerísseis", "inquerissem", 
		"inquerir", "inquerires", "inquerir", "inquerirmos", "inquerirdes", "inquerirem", 
		null, "inquere", "inquira", "inquiramos", "inqueri", "inquiram", 
		null, "inquiras", "inquira", "inquiramos", "inquirais", "inquiram", 
		"inquerir", "inquerires", "inquerir", "inquerirmos", "inquerirdes", "inquerirem", 
	};

	final static String jazer[] = {"jazer", "jazendo", "jazido",
		"jazo", "jazes", "jaz", "jazemos", "jazeis", "jazem", 
		"jazia", "jazias", "jazia", "jazíamos", "jazíeis", "jaziam", 
		"jazi", "jazeste", "jazeu", "jazemos", "jazestes", "jazeram", 
		"jazera", "jazeras", "jazera", "jazêramos", "jazêreis", "jazeram", 
		"jazeria", "jazerias", "jazeria", "jazeríamos", "jazeríeis", "jazeriam", 
		"jazerei", "jazerás", "jazerá", "jazeremos", "jazereis", "jazerão", 
		"jaza", "jazas", "jaza", "jazamos", "jazais", "jazam", 
		"jazesse", "jazesses", "jazesse", "jazêssemos", "jazêsseis", "jazessem", 
		"jazer", "jazeres", "jazer", "jazermos", "jazerdes", "jazerem", 
		null, "jaze", "jaza", "jazamos", "jazei", "jazam", 
		null, "jazas", "jaza", "jazamos", "jazais", "jazam", 
		"jazer", "jazeres", "jazer", "jazermos", "jazerdes", "jazerem", 
	};

	final static String magoar[] = {"magoar", "magoando", "magoado",
		"magôo", "magoas", "magoa", "magoamos", "magoais", "magoam", 
		"magoava", "magoavas", "magoava", "magoávamos", "magoáveis", "magoavam", 
		"magoei", "magoaste", "magoou", "magoamos", "magoastes", "magoaram", 
		"magoara", "magoaras", "magoara", "magoáramos", "magoáreis", "magoaram", 
		"magoaria", "magoarias", "magoaria", "magoaríamos", "magoaríeis", "magoariam", 
		"magoarei", "magoarás", "magoará", "magoaremos", "magoareis", "magoarão", 
		"magoe", "magoes", "magoe", "magoemos", "magoeis", "magoem", 
		"magoasse", "magoasses", "magoasse", "magoássemos", "magoásseis", "magoassem", 
		"magoar", "magoares", "magoar", "magoarmos", "magoardes", "magoarem", 
		null, "magoa", "magoe", "magoemos", "magoai", "magoem", 
		null, "magoes", "magoe", "magoemos", "magoeis", "magoem", 
		"magoar", "magoares", "magoar", "magoarmos", "magoardes", "magoarem", 
	};
	
	final static String mentir[] = {"mentir", "mentindo", "mentido",
		"minto", "mentes", "mente", "mentimos", "mentis", "mentem", 
		"mentia", "mentias", "mentia", "mentíamos", "mentíeis", "mentiam", 
		"menti", "mentiste", "mentiu", "mentimos", "mentistes", "mentiram", 
		"mentira", "mentiras", "mentira", "mentíramos", "mentíreis", "mentiram", 
		"mentiria", "mentirias", "mentiria", "mentiríamos", "mentiríeis", "mentiriam", 
		"mentirei", "mentirás", "mentirá", "mentiremos", "mentireis", "mentirão", 
		"minta", "mintas", "minta", "mintamos", "mintais", "mintam", 
		"mentisse", "mentisses", "mentisse", "mentíssemos", "mentísseis", "mentissem", 
		"mentir", "mentires", "mentir", "mentirmos", "mentirdes", "mentirem", 
		null, "mente", "minta", "mintamos", "menti", "mintam", 
		null, "mintas", "minta", "mintamos", "mintais", "mintam", 
		"mentir", "mentires", "mentir", "mentirmos", "mentirdes", "mentirem", 
	};
	
	final static String mobiliar[] = {"mobiliar", "mobiliando", "mobiliado",
		"mobílio", "mobílias", "mobília", "mobiliamos", "mobiliais", "mobíliam", 
		"mobiliava", "mobiliavas", "mobiliava", "mobiliávamos", "mobiliáveis", "mobiliavam", 
		"mobiliei", "mobiliaste", "mobiliou", "mobiliamos", "mobiliastes", "mobiliaram", 
		"mobiliara", "mobiliaras", "mobiliara", "mobiliáramos", "mobiliáreis", "mobiliaram", 
		"mobiliaria", "mobiliarias", "mobiliaria", "mobiliaríamos", "mobiliaríeis", "mobiliariam", 
		"mobiliarei", "mobiliarás", "mobiliará", "mobiliaremos", "mobiliareis", "mobiliarão", 
		"mobílie", "mobílies", "mobílie", "mobiliemos", "mobilieis", "mobíliem", 
		"mobiliasse", "mobiliasses", "mobiliasse", "mobiliássemos", "mobiliásseis", "mobiliassem", 
		"mobiliar", "mobiliares", "mobiliar", "mobiliarmos", "mobiliardes", "mobiliarem", 
		null, "mobília", "mobílie", "mobilemos", "mobiliai", "mobíliem", 
		null, "mobílies", "mobílie", "mobilemos", "mobilieis", "mobíliem", 
		"mobiliar", "mobiliares", "mobiliar", "mobiliarmos", "mobiliardes", "mobiliarem", 
	};
	
	final static String moer[] = {"moer", "moendo", "moído",
		"môo", "móis", "mói", "moemos", "moeis", "moem", 
		"moía", "moías", "moía", "moíamos", "moíeis", "moíam", 
		"moí", "moeste", "moeu", "moemos", "moestes", "moeram", 
		"moera", "moeras", "moera", "moêramos", "moêreis", "moeram", 
		"moeria", "moerias", "moeria", "moeríamos", "moeríeis", "moeriam", 
		"moerei", "moerás", "moerá", "moeremos", "moereis", "moerão", 
		"moa", "moas", "moa", "moamos", "moais", "moam", 
		"moesse", "moesses", "moesse", "moêssemos", "moêsseis", "moessem", 
		"moer", "moeres", "moer", "moermos", "moerdes", "moerem", 
		null, "mói", "moa", "moamos", "moei", "moam", 
		null, "moas", "moa", "moamos", "moais", "moam", 
		"moer", "moeres", "moer", "moermos", "moerdes", "moerem", 
	};
	
	final static String moscar[] = {"moscar", "moscando", "moscado",
		"musco", "muscas", "musca", "moscamos", "moscais", "muscam", 
		"moscava", "moscavas", "moscava", "moscávamos", "moscáveis", "moscavam", 
		"mosquei", "moscaste", "moscou", "moscamos", "moscastes", "moscaram", 
		"moscara", "moscaras", "moscara", "moscáramos", "moscáreis", "moscaram", 
		"moscaria", "moscarias", "moscaria", "moscaríamos", "moscaríeis", "moscariam", 
		"moscarei", "moscarás", "moscará", "moscaremos", "moscareis", "moscarão", 
		"musque", "musques", "musque", "mosquemos", "mosqueis", "musquem", 
		"moscasse", "moscasses", "moscasse", "moscássemos", "moscásseis", "moscassem", 
		"moscar", "moscares", "moscar", "moscarmos", "moscardes", "moscarem", 
		null, "musca", "musque", "mosquemos", "moscai", "musquem", 
		null, "mosques", "mosque", "mosquemos", "mosqueis", "mosquem", 
		"moscar", "moscares", "moscar", "moscarmos", "moscardes", "moscarem", 
	};

	final static String odiar[] = {"odiar", "odiando", "odiado",
		"odeio", "odeias", "odeia", "odiamos", "odiais", "odeiam", 
		"odiava", "odiavas", "odiava", "odiávamos", "odiáveis", "odiavam", 
		"odiei", "odiaste", "odiou", "odiamos", "odiastes", "odiaram", 
		"odiara", "odiaras", "odiara", "odiáramos", "odiáreis", "odiaram", 
		"odiaria", "odiarias", "odiaria", "odiaríamos", "odiaríeis", "odiariam", 
		"odiarei", "odiarás", "odiará", "odiaremos", "odiareis", "odiarão", 
		"odeie", "odeies", "odeie", "odiemos", "odieis", "odeiem", 
		"odiasse", "odiasses", "odiasse", "odiássemos", "odiásseis", "odiassem", 
		"odiar", "odiares", "odiar", "odiarmos", "odiardes", "odiarem", 
		null, "odeia", "odeie", "odiemos", "odiai", "odeiem", 
		null, "odeies", "odeie", "odiemos", "odieis", "odeiem", 
		"odiar", "odiares", "odiar", "odiarmos", "odiardes", "odiarem", 
	};
	
	final static String ouvir[] = {"ouvir", "ouvindo", "ouvido",
		"ouço", "ouves", "ouve", "ouvimos", "ouvis", "ouvem", 
		"ouvia", "ouvias", "ouvia", "ouvíamos", "ouvíeis", "ouviam", 
		"ouvi", "ouviste", "ouviu", "ouvimos", "ouvistes", "ouviram", 
		"ouvira", "ouviras", "ouvira", "ouvíramos", "ouvíreis", "ouviram", 
		"ouviria", "ouvirias", "ouviria", "ouviríamos", "ouviríeis", "ouviriam", 
		"ouvirei", "ouvirás", "ouvirá", "ouviremos", "ouvireis", "ouvirão", 
		"ouça", "ouças", "ouça", "ouçamos", "ouçais", "ouçam", 
		"ouvisse", "ouvisses", "ouvisse", "ouvíssemos", "ouvísseis", "ouvissem", 
		"ouvir", "ouvires", "ouvir", "ouvirmos", "ouvirdes", "ouvirem", 
		null, "ouve", "ouça", "ouçamos", "ouçais", "ouçam", 
		null, "ouças", "ouça", "ouçamos", "ouçais", "ouçam", 
		"ouvir", "ouvires", "ouvir", "ouvirmos", "ouvirdes", "ouvirem", 
	};

	final static String partir[] = {"partir", "partindo", "partido",
		"parto", "partes", "parte", "partimos", "partis", "partem", 
		"partia", "partias", "partia", "partíamos", "partíeis", "partiam", 
		"parti", "partiste", "partiu", "partimos", "partistes", "partiram", 
		"partira", "partiras", "partira", "partíramos", "partíreis", "partiram", 
		"partiria", "partirias", "partiria", "partiríamos", "partiríeis", "partiriam", 
		"partirei", "partirás", "partirá", "partiremos", "partireis", "partirão", 
		"parta", "partas", "parta", "partamos", "partais", "partam", 
		"partisse", "partisses", "partisse", "partíssemos", "partísseis", "partissem", 
		"partir", "partires", "partir", "partirmos", "partirdes", "partirem", 
		null, "parte", "parta", "partamos", "parti", "partam", 
		null, "partas", "parta", "partamos", "partais", "partam", 
		"partir", "partires", "partir", "partirmos", "partirdes", "partirem", 
	};
	
	final static String passear[] = {"passear", "passeando", "passeado",
		"passeio", "passeias", "passeia", "passeamos", "passeais", "passeiam", 
		"passeava", "passeavas", "passeava", "passeávamos", "passeáveis", "passeavam", 
		"passeei", "passeaste", "passeou", "passeamos", "passeastes", "passearam", 
		"passeara", "passearas", "passeara", "passeáramos", "passeáreis", "passearam", 
		"passearia", "passearias", "passearia", "passearíamos", "passearíeis", "passeariam", 
		"passearei", "passearás", "passeará", "passearemos", "passeareis", "passearão", 
		"passeie", "passeies", "passeie", "passeemos", "passeeis", "passeiem", 
		"passeasse", "passeasses", "passeasse", "passeássemos", "passeásseis", "passeassem", 
		"passear", "passeares", "passear", "passearmos", "passeardes", "passearem", 
		null, "passeia", "passeie", "passeemos", "passeai", "passeiem", 
		null, "passeies", "passeie", "passeemos", "passeeis", "passeiem", 
		"passear", "passeares", "passear", "passearmos", "passeardes", "passearem", 
	};
	
	final static String pedir[] = {"pedir", "pedindo", "pedido",
		"peço", "pedes", "pede", "pedimos", "pedis", "pedem", 
		"pedia", "pedias", "pedia", "pedíamos", "pedíeis", "pediam", 
		"pedi", "pediste", "pediu", "pedimos", "pedistes", "pediram", 
		"pedira", "pediras", "pedira", "pedíramos", "pedíreis", "pediram", 
		"pediria", "pedirias", "pediria", "pediríamos", "pediríeis", "pediriam", 
		"pedirei", "pedirás", "pedirá", "pediremos", "pedireis", "pedirão", 
		"peça", "peças", "peça", "peçamos", "peçais", "peçam", 
		"pedisse", "pedisses", "pedisse", "pedíssemos", "pedísseis", "pedissem", 
		"pedir", "pedires", "pedir", "pedirmos", "pedirdes", "pedirem", 
		null, "pede", "peça", "peçamos", "pedi", "peçam", 
		null, "peças", "peça", "peçamos", "peçais", "peçam", 
		"pedir", "pedires", "pedir", "pedirmos", "pedirdes", "pedirem", 
	};
	
	final static String perder[] = {"perder", "perdendo", "perdido",
		"perco", "perdes", "perde", "perdemos", "perdeis", "perdem", 
		"perdia", "perdias", "perdia", "perdíamos", "perdíeis", "perdiam", 
		"perdi", "perdeste", "perdeu", "perdemos", "perdestes", "perderam", 
		"perdera", "perderas", "perdera", "perdêramos", "perdêreis", "perderam", 
		"perderia", "perderias", "perderia", "perderíamos", "perderíeis", "perderiam", 
		"perderei", "perderás", "perderá", "perderemos", "perdereis", "perderão", 
		"perca", "percas", "perca", "percamos", "percais", "percam", 
		"perdesse", "perdesses", "perdesse", "perdêssemos", "perdêsseis", "perdessem", 
		"perder", "perderes", "perder", "perdermos", "perderdes", "perderem", 
		null, "perde", "perca", "percamos", "perdei", "percam", 
		null, "percas", "perca", "percamos", "percais", "percam", 
		"perder", "perderes", "perder", "perdermos", "perderdes", "perderem", 
	};
	
	final static String poder[] = {"poder", "podendo", "podido",
		"posso", "podes", "pode", "podemos", "podeis", "podem", 
		"podia", "podias", "podia", "podíamos", "podíeis", "podiam", 
		"pude", "pudeste", "pôde", "pudemos", "pudestes", "puderam", 
		"pudera", "puderas", "pudera", "pudéramos", "pudéreis", "puderam", 
		"poderia", "poderias", "poderia", "poderíamos", "poderíeis", "poderiam", 
		"poderei", "poderás", "poderá", "poderemos", "podereis", "poderão", 
		"possa", "possas", "possa", "possamos", "possais", "possam", 
		"pudesse", "pudesses", "pudesse", "pudéssemos", "pudésseis", "pudessem", 
		"puder", "puderes", "puder", "pudermos", "puderdes", "puderem", 
		null, null, null, null, null, null, 
		null, null, null, null, null, null, 
		"poder", "poderes", "poder", "podermos", "poderdes", "poderem", 
	};
	
	final static String por[] = {"pôr", "pondo", "posto",
		"ponho", "pões", "põe", "pomos", "pondes", "põem", 
		"punha", "punhas", "punha", "púnhamos", "púnheis", "punham", 
		"pus", "puseste", "pôs", "pusemos", "pusestes", "puseram", 
		"pusera", "puseras", "pusera", "puséramos", "puséreis", "puseram", 
		"poria", "porias", "poria", "poríamos", "poríeis", "poriam", 
		"porei", "porás", "porá", "poremos", "poreis", "porão", 
		"ponha", "ponhas", "ponha", "ponhamos", "ponhais", "ponham", 
		"pusesse", "pusesses", "pusesse", "puséssemos", "pusésseis", "pusessem", 
		"puser", "puseres", "puser", "pusermos", "puserdes", "puserem", 
		null, "põe", "ponha", "ponhamos", "ponde", "ponham", 
		null, "ponhas", "ponha", "ponhamos", "ponhais", "ponham", 
		"pôr", "pores", "pôr", "pormos", "pordes", "porem", 
	};
	
	final static String precaver[] = {"precaver", "precavendo", "precavido",
		null, null, null, "precavemos", "precaveis", null, 
		"precavia", "precavias", "precavia", "precavíamos", "precavíeis", "precaviam", 
		"precavi", "precaveste", "precaveu", "precavemos", "precavestes", "precaveram", 
		"precavera", "precaveras", "precavera", "precavêramos", "precavêreis", "precaveram", 
		"precaveria", "precaverias", "precaveria", "precaveríamos", "precaveríeis", "precaveriam", 
		"precaverei", "precaverás", "precaverá", "precaveremos", "precavereis", "precaverão", 
		null, null, null, null, null, null, 
		"precavesse", "precavesses", "precavesse", "precavêssemos", "precavêsseis", "precavessem", 
		"precaver", "precaveres", "precaver", "precavermos", "precaverdes", "precaverem", 
		null, null, null, null, "precavei", null, 
		null, null, null, null, null, null, 
		"precaver", "precaveres", "precaver", "precavermos", "precaverdes", "precaverem", 
	};
	
	final static String prevenir[] = {"prevenir", "prevenindo", "prevenido",
		"previno", "prevines", "previne", "prevenimos", "prevenis", "previnem", 
		"prevenia", "prevenias", "prevenia", "preveníamos", "preveníeis", "preveniam", 
		"preveni", "preveniste", "preveniu", "prevenimos", "prevenistes", "preveniram", 
		"prevenira", "preveniras", "prevenira", "preveníramos", "preveníreis", "preveniram", 
		"preveniria", "prevenirias", "preveniria", "preveniríamos", "preveniríeis", "preveniriam", 
		"prevenirei", "prevenirás", "prevenirá", "preveniremos", "prevenireis", "prevenirão", 
		"previna", "previnas", "previna", "previnamos", "previnais", "previnam", 
		"prevenisse", "prevenisses", "prevenisse", "preveníssemos", "prevenísseis", "prevenissem", 
		"prevenir", "prevenires", "prevenir", "prevenirmos", "prevenirdes", "prevenirem", 
		null, "previne", "previna", "previnamos", "preveni", "previnam", 
		null, "previnas", "previna", "previnamos", "previnais", "previnam", 
		"prevenir", "prevenires", "prevenir", "prevenirmos", "prevenirdes", "prevenirem", 
	};
	
	final static String progredir[] = {"progredir", "progredindo", "progredido",
		"progrido", "progrides", "progride", "progredimos", "progredis", "progridem", 
		"progredia", "progredias", "progredia", "progredíamos", "progredíeis", "progrediam", 
		"progredi", "progrediste", "progrediu", "progredimos", "progredistes", "progrediram", 
		"progredira", "progrediras", "progredira", "progredíramos", "progredíreis", "progrediram", 
		"progrediria", "progredirias", "progrediria", "progrediríamos", "progrediríeis", "progrediriam", 
		"progredirei", "progredirás", "progredirá", "progrediremos", "progredireis", "progredirão", 
		"progrida", "progridas", "progrida", "progridamos", "progridais", "progridam", 
		"progredisse", "progredisses", "progredisse", "progredíssemos", "progredísseis", "progredissem", 
		"progredir", "progredires", "progredir", "progredirmos", "progredirdes", "progredirem", 
		null, "progride", "progrida", "progridamos", "progredi", "progridam", 
		null, "progridas", "progrida", "progridamos", "progridais", "progridam", 
		"progredir", "progredires", "progredir", "progredirmos", "progredirdes", "progredirem", 
	};
	
	final static String proibir[] = {"proibir", "proibindo", "proibido",
		"proíbo", "proíbes", "proíbe", "proibimos", "proibis", "proíbem", 
		"proibia", "proibias", "proibia", "proibíamos", "proibíeis", "proibiam", 
		"proibi", "proibiste", "proibiu", "proibimos", "proibistes", "proibiram", 
		"proibira", "proibiras", "proibira", "proibíramos", "proibíreis", "proibiram", 
		"proibiria", "proibirias", "proibiria", "proibiríamos", "proibiríeis", "proibiriam", 
		"proibirei", "proibirás", "proibirá", "proibiremos", "proibireis", "proibirão", 
		"proíba", "proíbas", "proíba", "proibamos", "proibais", "proíbam", 
		"proibisse", "proibisses", "proibisse", "proibíssemos", "proibísseis", "proibissem", 
		"proibir", "proibires", "proibir", "proibirmos", "proibirdes", "proibirem", 
		null, "proíbe", "proíba", "proibamos", "proibi", "proíbam", 
		null, "proíbas", "proíba", "proibamos", "proibais", "proíbam", 
		"proibir", "proibires", "proibir", "proibirmos", "proibirdes", "proibirem", 
	};
	
	final static String propor[] = {"propor", "propondo", "proposto",
		"proponho", "propões", "propõe", "propomos", "propondes", "propõem", 
		"propunha", "propunhas", "propunha", "propúnhamos", "propúnheis", "propunham", 
		"propus", "propuseste", "propôs", "propusemos", "propusestes", "propuseram", 
		"propusera", "propuseras", "propusera", "propuséramos", "propuséreis", "propuseram", 
		"proporia", "proporias", "proporia", "proporíamos", "proporíeis", "proporiam", 
		"proporei", "proporás", "proporá", "proporemos", "proporeis", "proporão", 
		"proponha", "proponhas", "proponha", "proponhamos", "proponhais", "proponham", 
		"propusesse", "propusesses", "propusesse", "propuséssemos", "propusésseis", "propusessem", 
		"propuser", "propuseres", "propuser", "propusermos", "propuserdes", "propuserem", 
		null, "propõe", "proponha", "proponhamos", "proponde", "proponham", 
		null, "proponhas", "proponha", "proponhamos", "proponhais", "proponham", 
		"propor", "propores", "propor", "propormos", "propordes", "proporem", 
	};
	
	final static String proteger[] = {"proteger", "protegendo", "protegido",
		"protejo", "proteges", "protege", "protegemos", "protegeis", "protegem", 
		"protegia", "protegias", "protegia", "protegíamos", "protegíeis", "protegiam", 
		"protegi", "protegeste", "protegeu", "protegemos", "protegestes", "protegeram", 
		"protegera", "protegeras", "protegera", "protegêramos", "protegêreis", "protegeram", 
		"protegeria", "protegerias", "protegeria", "protegeríamos", "protegeríeis", "protegeriam", 
		"protegerei", "protegerás", "protegerá", "protegeremos", "protegereis", "protegerão", 
		"proteja", "protejas", "proteja", "protejamos", "protejais", "protejam", 
		"protegesse", "protegesses", "protegesse", "protegêssemos", "protegêsseis", "protegessem", 
		"proteger", "protegeres", "proteger", "protegermos", "protegerdes", "protegerem", 
		null, "protege", "proteja", "protejamos", "protegei", "protejam", 
		null, "protejas", "proteja", "protejamos", "protejais", "protejam", 
		"proteger", "protegeres", "proteger", "protegermos", "protegerdes", "protegerem", 
	};
	
	final static String prover[] = {"prover", "provendo", "provido",
		"provejo", "provês", "provê", "provemos", "provedes", "provêem", 
		"provia", "provias", "provia", "províamos", "províeis", "proviam", 
		"provi", "proveste", "proveu", "provemos", "provestes", "proveram", 
		"provera", "proveras", "provera", "provêramos", "provêreis", "proveram", 
		"proveria", "proverias", "proveria", "proveríamos", "proveríeis", "proveriam", 
		"proverei", "proverás", "proverá", "proveremos", "provereis", "proverão", 
		"proveja", "provejas", "proveja", "provejamos", "provejais", "provejam", 
		"provesse", "provesses", "provesse", "provêssemos", "provêsseis", "provessem", 
		"prover", "proveres", "prover", "provermos", "proverdes", "proverem", 
		null, "provê", "proveja", "provejamos", "provede", "provejam", 
		null, "provejas", "proveja", "provejamos", "provejais", "provejam", 
		"prover", "proveres", "prover", "provermos", "proverdes", "proverem", 
	};

	final static String querer[] = {"querer", "querendo", "querido",
		"quero", "queres", "quer", "queremos", "quereis", "querem", 
		"queria", "querias", "queria", "queríamos", "queríeis", "queriam", 
		"quis", "quiseste", "quis", "quisemos", "quisestes", "quiseram", 
		"quisera", "quiseras", "quisera", "quiséramos", "quiséreis", "quiseram", 
		"quereria", "quererias", "quereria", "quereríamos", "quereríeis", "quereriam", 
		"quererei", "quererás", "quererá", "quereremos", "querereis", "quererão", 
		"queira", "queiras", "queira", "queiramos", "queirais", "queiram", 
		"quisesse", "quisesses", "quisesse", "quiséssemos", "quisésseis", "quisessem", 
		"quiser", "quiseres", "quiser", "quisermos", "quiserdes", "quiserem", 
		null, "quer", "queira", "queiramos", "querei", "queiram", 
		null, "queiras", "queira", "queiramos", "queirais", "queiram", 
		"querer", "quereres", "querer", "querermos", "quererdes", "quererem", 
	};

	final static String reaver[] = {"reaver", "reavendo", "reavido",
		null, null, null, "reavemos", "reaveis", null, 
		"reavia", "reavias", "reavia", "reavíamos", "reavíeis", "reaviam", 
		"reouve", "reouveste", "reouve", "reouvemos", "reouvestes", "reouveram", 
		"reouvera", "reouveras", "reouvera", "reouvéramos", "reouvéreis", "reouveram", 
		"reaveria", "reaverias", "reaveria", "reaveríamos", "reaveríeis", "reaveriam", 
		"reaverei", "reaverás", "reaverá", "reaveremos", "reavereis", "reaverão", 
		null, null, null, null, null, null, 
		"reouvesse", "reouvesses", "reouvesse", "reouvéssemos", "reouvésseis", "reouvessem", 
		"reouver", "reouveres", "reouver", "reouvermos", "reouverdes", "reouverem", 
		null, null, null, null, "reavei", null, 
		null, null, null, null, null, null, 
		"reaver", "reaveres", "reaver", "reavermos", "reaverdes", "reaverem", 
	};
	
	final static String refletir[] = {"refletir", "refletindo", "refletido",
		"reflito", "refletes", "reflete", "refletimos", "refletis", "refletem", 
		"refletia", "refletias", "refletia", "refletíamos", "refletíeis", "refletiam", 
		"refleti", "refletiste", "refletiu", "refletimos", "refletistes", "refletiram", 
		"refletira", "refletiras", "refletira", "refletíramos", "refletíreis", "refletiram", 
		"refletiria", "refletirias", "refletiria", "refletiríamos", "refletiríeis", "refletiriam", 
		"refletirei", "refletirás", "refletirá", "refletiremos", "refletireis", "refletirão", 
		"reflita", "reflitas", "reflita", "reflitamos", "reflitais", "reflitam", 
		"refletisse", "refletisses", "refletisse", "refletíssemos", "refletísseis", "refletissem", 
		"refletir", "refletires", "refletir", "refletirmos", "refletirdes", "refletirem", 
		null, "reflete", "reflita", "reflitamos", "refleti", "reflitam", 
		null, "reflitas", "reflita", "reflitamos", "reflitais", "reflitam", 
		"refletir", "refletires", "refletir", "refletirmos", "refletirdes", "refletirem", 
	};
	
	final static String requerer[] = {"requerer", "requerendo", "requerido",
		"requeiro", "requeres", "requer", "requeremos", "requereis", "requerem", 
		"requeria", "requerias", "requeria", "requeríamos", "requeríeis", "requeriam", 
		"requeri", "requereste", "requereu", "requeremos", "requerestes", "requereram", 
		"requerera", "requereras", "requerera", "requerêramos", "requerêreis", "requereram", 
		"requereria", "requererias", "requereria", "requereríamos", "requereríeis", "requereriam", 
		"requererei", "requererás", "requererá", "requereremos", "requerereis", "requererão", 
		"requeira", "requeiras", "requeira", "requeiramos", "requeirais", "requeiram", 
		"requeresse", "requeresses", "requeresse", "requerêssemos", "requerêsseis", "requeressem", 
		"requerer", "requereres", "requerer", "requerermos", "requererdes", "requererem", 
		null, "requere", "requeira", "requeiramos", "requerei", "requeiram", 
		null, "requeiras", "requeira", "requeiramos", "requeirais", "requeiram", 
		"requerer", "requereres", "requerer", "requerermos", "requererdes", "requererem", 
	};
	
	final static String resfolegar[] = {"resfolegar", "resfolegando", "resfolegado",
		"resfólego", "resfólegas", "resfólega", "resfolegamos", "resfolegais", "resfólegam", 
		"resfolegava", "resfolegavas", "resfolegava", "resfolegávamos", "resfolegáveis", "resfolegavam", 
		"resfoleguei", "resfolegaste", "resfolegou", "resfolegamos", "resfolegastes", "resfolegaram", 
		"resfolegara", "resfolegaras", "resfolegara", "resfolegáramos", "resfolegáreis", "resfolegaram", 
		"resfolegaria", "resfolegarias", "resfolegaria", "resfolegaríamos", "resfolegaríeis", "resfolegariam", 
		"resfolegarei", "resfolegarás", "resfolegará", "resfolegaremos", "resfolegareis", "resfolegarão", 
		"resfólegue", "resfólegues", "resfólegue", "resfoleguemos", "resfolegueis", "resfóleguem", 
		"resfolegasse", "resfolegasses", "resfolegasse", "resfolegássemos", "resfolegásseis", "resfolegassem", 
		"resfolegar", "resfolegares", "resfolegar", "resfolegarmos", "resfolegardes", "resfolegarem", 
		null, "resfólega", "resfólegue", "resfoleguemos", "resfolegai", "resfóleguem", 
		null, "resfólegues", "resfólegue", "resfoleguemos", "resfolegueis", "resfóleguem", 
		"resfolegar", "resfolegares", "resfolegar", "resfolegarmos", "resfolegardes", "resfolegarem", 
	};
	
	final static String ressarcir[] = {"ressarcir", "ressarcindo", "ressarcido",
		null, null, null, "ressarcimos", "ressarcis", null, 
		"ressarcia", "ressarcias", "ressarcia", "ressarcíamos", "ressarcíeis", "ressarciam", 
		"ressarci", "ressarciste", "ressarciu", "ressarcimos", "ressarcistes", "ressarciram", 
		"ressarcira", "ressarciras", "ressarcira", "ressarcíramos", "ressarcíreis", "ressarciram", 
		"ressarciria", "ressarcirias", "ressarciria", "ressarciríamos", "ressarciríeis", "ressarciriam", 
		"ressarcirei", "ressarcirás", "ressarcirá", "ressarciremos", "ressarcireis", "ressarcirão", 
		null, null, null, null, null, null, 
		"ressarcisse", "ressarcisses", "ressarcisse", "ressarcíssemos", "ressarcísseis", "ressarcissem", 
		"ressarcir", "ressarcires", "ressarcir", "ressarcirmos", "ressarcirdes", "ressarcirem", 
		null, null, null, null, "ressarci", null, 
		null, null, null, null, null, null, 
		"ressarcir", "ressarcires", "ressarcir", "ressarcirmos", "ressarcirdes", "ressarcirem", 
	};
	
	final static String reunir[] = {"reunir", "reunindo", "reunido",
		"reúno", "reúnes", "reúne", "reunimos", "reunis", "reúnem", 
		"reunia", "reunias", "reunia", "reuníamos", "reuníeis", "reuniam", 
		"reuni", "reuniste", "reuniu", "reunimos", "reunistes", "reuniram", 
		"reunira", "reuniras", "reunira", "reuníramos", "reuníreis", "reuniram", 
		"reuniria", "reunirias", "reuniria", "reuniríamos", "reuniríeis", "reuniriam", 
		"reunirei", "reunirás", "reunirá", "reuniremos", "reunireis", "reunirão", 
		"reúna", "reúnas", "reúna", "reunamos", "reunais", "reúnam", 
		"reunisse", "reunisses", "reunisse", "reuníssemos", "reunísseis", "reunissem", 
		"reunir", "reunires", "reunir", "reunirmos", "reunirdes", "reunirem", 
		null, "reúne", "reúna", "reunamos", "reuni", "reúnam", 
		null, "reúnas", "reúna", "reunamos", "reunais", "reúnam", 
		"reunir", "reunires", "reunir", "reunirmos", "reunirdes", "reunirem", 
	};
	
	final static String ruir[] = {"ruir", "ruindo", "ruído",
		null, "ruis", "rui", "ruímos", "ruís", "ruem", 
		"ruía", "ruías", "ruía", "ruíamos", "ruíeis", "ruíam", 
		"ruí", "ruíste", "ruiu", "ruímos", "ruístes", "ruíram", 
		"ruíra", "ruíras", "ruíra", "ruíramos", "ruíreis", "ruíram", 
		"ruiria", "ruirias", "ruiria", "ruiríamos", "ruiríeis", "ruiriam", 
		"ruirei", "ruirás", "ruirá", "ruiremos", "ruireis", "ruirão", 
		null, null, null, null, null, null, 
		"ruísse", "ruísses", "ruísse", "ruíssemos", "ruísseis", "ruíssem", 
		"ruir", "ruíres", "ruir", "ruirmos", "ruirdes", "ruírem", 
		null, "rui", null, null, "ruí", null, 
		null, null, null, null, null, null, 
		"ruir", "ruíres", "ruir", "ruirmos", "ruirdes", "ruírem", 
	};

	final static String saber[] = {"saber", "sabendo", "sabido",
		"sei", "sabes", "sabe", "sabemos", "sabeis", "sabem", 
		"sabia", "sabias", "sabia", "sabíamos", "sabíeis", "sabiam", 
		"soube", "soubeste", "soube", "soubemos", "soubestes", "souberam", 
		"soubera", "souberas", "soubera", "soubéramos", "soubéreis", "souberam", 
		"saberia", "saberias", "saberia", "saberíamos", "saberíeis", "saberiam", 
		"saberei", "saberás", "saberá", "saberemos", "sabereis", "saberão", 
		"saiba", "saibas", "saiba", "saibamos", "saibais", "saibam", 
		"soubesse", "soubesses", "soubesse", "soubéssemos", "soubésseis", "soubessem", 
		"souber", "souberes", "souber", "soubermos", "souberdes", "souberem", 
		null, "sabe", "saiba", "saibamos", "sabei", "saibam", 
		null, "saibas", "saiba", "saibamos", "saibais", "saibam", 
		"saber", "saberes", "saber", "sabermos", "saberdes", "saberem", 
	};
	
	final static String saudar[] = {"saudar", "saudando", "saudado",
		"saúdo", "saúdas", "saúda", "saudamos", "saudais", "saúdam", 
		"saudava", "saudavas", "saudava", "saudávamos", "saudáveis", "saudavam", 
		"saudei", "saudaste", "saudou", "saudamos", "saudastes", "saudaram", 
		"saudara", "saudaras", "saudara", "saudáramos", "saudáreis", "saudaram", 
		"saudaria", "saudarias", "saudaria", "saudaríamos", "saudaríeis", "saudariam", 
		"saudarei", "saudarás", "saudará", "saudaremos", "saudareis", "saudarão", 
		"saúde", "saúdes", "saúde", "saudemos", "saudeis", "saúdem", 
		"saudasse", "saudasses", "saudasse", "saudássemos", "saudásseis", "saudassem", 
		"saudar", "saudares", "saudar", "saudarmos", "saudardes", "saudarem", 
		null, "saúda", "saúde", "saudemos", "saudai", "saúdem", 
		null, "saúdes", "saúde", "saudemos", "saudeis", "saúdem", 
		"saudar", "saudares", "saudar", "saudarmos", "saudardes", "saudarem", 
	};
	
	final static String seguir[] = {"seguir", "seguindo", "seguido",
		"sigo", "segues", "segue", "seguimos", "seguis", "seguem", 
		"seguia", "seguias", "seguia", "seguíamos", "seguíeis", "seguiam", 
		"segui", "seguiste", "seguiu", "seguimos", "seguistes", "seguiram", 
		"seguira", "seguiras", "seguira", "seguíramos", "seguíreis", "seguiram", 
		"seguiria", "seguirias", "seguiria", "seguiríamos", "seguiríeis", "seguiriam", 
		"seguirei", "seguirás", "seguirá", "seguiremos", "seguireis", "seguirão", 
		"siga", "sigas", "siga", "sigamos", "sigais", "sigam", 
		"seguisse", "seguisses", "seguisse", "seguíssemos", "seguísseis", "seguissem", 
		"seguir", "seguires", "seguir", "seguirmos", "seguirdes", "seguirem", 
		null, "segue", "siga", "sigamos", "segui", "sigam", 
		null, "sigas", "siga", "sigamos", "sigais", "sigam", 
		"seguir", "seguires", "seguir", "seguirmos", "seguirdes", "seguirem", 
	};
	
	final static String servir[] = {"servir", "servindo", "servido",
		"sirvo", "serves", "serve", "servimos", "servis", "servem", 
		"servia", "servias", "servia", "servíamos", "servíeis", "serviam", 
		"servi", "serviste", "serviu", "servimos", "servistes", "serviram", 
		"servira", "serviras", "servira", "servíramos", "servíreis", "serviram", 
		"serviria", "servirias", "serviria", "serviríamos", "serviríeis", "serviriam", 
		"servirei", "servirás", "servirá", "serviremos", "servireis", "servirão", 
		"sirva", "sirvas", "sirva", "sirvamos", "sirvais", "sirvam", 
		"servisse", "servisses", "servisse", "servíssemos", "servísseis", "servissem", 
		"servir", "servires", "servir", "servirmos", "servirdes", "servirem", 
		null, "serve", "sirva", "sirvamos", "servi", "sirvam", 
		null, "sirvas", "sirva", "sirvamos", "sirvais", "sirvam", 
		"servir", "servires", "servir", "servirmos", "servirdes", "servirem", 
	};
	
	final static String sortir[] = {"sortir", "sortindo", "sortido",
		"surto", "surtes", "surte", "sortimos", "sortis", "surtem", 
		"sortia", "sortias", "sortia", "sortíamos", "sortíeis", "sortiam", 
		"sorti", "sortiste", "sortiu", "sortimos", "sortistes", "sortiram", 
		"sortira", "sortiras", "sortira", "sortíramos", "sortíreis", "sortiram", 
		"sortiria", "sortirias", "sortiria", "sortiríamos", "sortiríeis", "sortiriam", 
		"sortirei", "sortirás", "sortirá", "sortiremos", "sortireis", "sortirão", 
		"surta", "surtas", "surta", "surtamos", "surtais", "surtam", 
		"sortisse", "sortisses", "sortisse", "sortíssemos", "sortísseis", "sortissem", 
		"sortir", "sortires", "sortir", "sortirmos", "sortirdes", "sortirem", 
		null, "surte", "surta", "surtamos", "sorti", "surtam", 
		null, "surtas", "surta", "surtamos", "surtais", "surtam", 
		"sortir", "sortires", "sortir", "sortirmos", "sortirdes", "sortirem", 
	};
	
	final static String subir[] = {"subir", "subindo", "subido",
		"subo", "sobes", "sobe", "subimos", "subis", "sobem", 
		"subia", "subias", "subia", "subíamos", "subíeis", "subiam", 
		"subi", "subiste", "subiu", "subimos", "subistes", "subiram", 
		"subira", "subiras", "subira", "subíramos", "subíreis", "subiram", 
		"subiria", "subirias", "subiria", "subiríamos", "subiríeis", "subiriam", 
		"subirei", "subirás", "subirá", "subiremos", "subireis", "subirão", 
		"suba", "subas", "suba", "subamos", "subais", "subam", 
		"subisse", "subisses", "subisse", "subíssemos", "subísseis", "subissem", 
		"subir", "subires", "subir", "subirmos", "subirdes", "subirem", 
		null, "sobe", "suba", "subamos", "subi", "subam", 
		null, "subas", "suba", "subamos", "subais", "subam", 
		"subir", "subires", "subir", "subirmos", "subirdes", "subirem", 
	};
	
	final static String sumir[] = {"sumir", "sumindo", "sumido",
		"sumo", "somes", "some", "sumimos", "sumis", "somem", 
		"sumia", "sumias", "sumia", "sumíamos", "sumíeis", "sumiam", 
		"sumi", "sumiste", "sumiu", "sumimos", "sumistes", "sumiram", 
		"sumira", "sumiras", "sumira", "sumíramos", "sumíreis", "sumiram", 
		"sumiria", "sumirias", "sumiria", "sumiríamos", "sumiríeis", "sumiriam", 
		"sumirei", "sumirás", "sumirá", "sumiremos", "sumireis", "sumirão", 
		"suma", "sumas", "suma", "sumamos", "sumais", "sumam", 
		"sumisse", "sumisses", "sumisse", "sumíssemos", "sumísseis", "sumissem", 
		"sumir", "sumires", "sumir", "sumirmos", "sumirdes", "sumirem", 
		null, "some", "suma", "sumamos", "sumi", "sumam", 
		null, "sumas", "suma", "sumamos", "sumais", "sumam", 
		"sumir", "sumires", "sumir", "sumirmos", "sumirdes", "sumirem", 
	};
	
	final static String surtir[] = {"surtir", "surtindo", "surtido",
		null, null, "surte", null, null, "surtem", 
		null, null, "surtia", null, null, "surtiam",
		null, null, "surtiu", null, null, "surtiram",
		null, null, "surtira", null, null, "surtiram",
		null, null, "surtiria", null, null, "surtiriam",
		null, null, "surtirá", null, null, "surtirão",
		null, null, "surta", null, null, "surtam",
		null, null, "surtisse", null, null, "surtissem",
		null, null, "surtir", null, null, "surtirem",
		null, null, null, null, null, null, 
		null, null, "surta", null, null, "surtam",
		null, null, "surtir", null, null, "surtirem"
	};

	final static String tossir[] = {"tossir", "tossindo", "tossido",
		"tusso", "tosses", "tosse", "tossimos", "tossis", "tossem", 
		"tossia", "tossias", "tossia", "tossíamos", "tossíeis", "tossiam", 
		"tossi", "tossiste", "tossiu", "tossimos", "tossistes", "tossiram", 
		"tossira", "tossiras", "tossira", "tossíramos", "tossíreis", "tossiram", 
		"tossiria", "tossirias", "tossiria", "tossiríamos", "tossiríeis", "tossiriam", 
		"tossirei", "tossirás", "tossirá", "tossiremos", "tossireis", "tossirão", 
		"tussa", "tussas", "tussa", "tussamos", "tussais", "tussam", 
		"tossisse", "tossisses", "tossisse", "tossíssemos", "tossísseis", "tossissem", 
		"tossir", "tossires", "tossir", "tossirmos", "tossirdes", "tossirem", 
		null, "tosse", "tussa", "tussamos", "tossi", "tussam", 
		null, "tussas", "tussa", "tussamos", "tussais", "tussam", 
		"tossir", "tossires", "tossir", "tossirmos", "tossirdes", "tossirem", 
	};
	
	final static String traduzir[] = {"traduzir", "traduzindo", "traduzido",
		"traduzo", "traduzes", "traduz", "traduzimos", "traduzis", "traduzem", 
		"traduzia", "traduzias", "traduzia", "traduzíamos", "traduzíeis", "traduziam", 
		"traduzi", "traduziste", "traduziu", "traduzimos", "traduzistes", "traduziram", 
		"traduzira", "traduziras", "traduzira", "traduzíramos", "traduzíreis", "traduziram", 
		"traduziria", "traduzirias", "traduziria", "traduziríamos", "traduziríeis", "traduziriam", 
		"traduzirei", "traduzirás", "traduzirá", "traduziremos", "traduzireis", "traduzirão", 
		"traduza", "traduzas", "traduza", "traduzamos", "traduzais", "traduzam", 
		"traduzisse", "traduzisses", "traduzisse", "traduzíssemos", "traduzísseis", "traduzissem", 
		"traduzir", "traduzires", "traduzir", "traduzirmos", "traduzirdes", "traduzirem", 
		null, "traduze", "traduza", "traduzamos", "traduzi", "traduzam", 
		null, "traduzas", "traduza", "traduzamos", "traduzais", "traduzam", 
		"traduzir", "traduzires", "traduzir", "traduzirmos", "traduzirdes", "traduzirem", 
	};

	final static String trazer[] = {"trazer", "trazendo", "trazido",
		"trago", "trazes", "traz", "trazemos", "trazeis", "trazem", 
		"trazia", "trazias", "trazia", "trazíamos", "trazíeis", "traziam", 
		"trouxe", "trouxeste", "trouxe", "trouxemos", "trouxestes", "trouxeram", 
		"trouxera", "trouxeras", "trouxera", "trouxéramos", "trouxéreis", "trouxeram", 
		"traria", "trarias", "traria", "traríamos", "traríeis", "trariam", 
		"trarei", "trarás", "trará", "traremos", "trareis", "trarão", 
		"traga", "tragas", "traga", "tragamos", "tragais", "tragam", 
		"trouxesse", "trouxesses", "trouxesse", "trouxéssemos", "trouxésseis", "trouxessem", 
		"trouxer", "trouxeres", "trouxer", "trouxermos", "trouxerdes", "trouxerem", 
		null, "traze", "traga", "tragamos", "trazei", "tragam", 
		null, "tragas", "traga", "tragamos", "tragais", "tragam", 
		"trazer", "trazeres", "trazer", "trazermos", "trazerdes", "trazerem", 
	};

	final static String urgir[] = {"urgir", "urgindo", "urgido",
		null, null, "urge", null, null, "urgem",
		null, null, "urgia", null, null, "urgiam",
		null, null, "urgiu", null, null, "urgiram",
		null, null, "urgira", null, null, "urgiram",
		null, null, "urgiria", null, null, "urgiriam",
		null, null, "urgirá", null, null, "urgirão",
		null, null, "urja", null, null, "urjam",
		null, null, "urgisse", null, null, "urgissem",
		null, null, "urgir", null, null, "urgirem",
		null, null, null, null, null, null, 
		null, null, null, null, null, null, 
		null, null, "urgir", null, null, "urgirem"
	};

	final static String valer[] = {"valer", "valendo", "valido",
		"valho", "vales", "vale", "valemos", "valeis", "valem", 
		"valia", "valias", "valia", "valíamos", "valíeis", "valiam", 
		"vali", "valeste", "valeu", "valemos", "valestes", "valeram", 
		"valera", "valeras", "valera", "valêramos", "valêreis", "valeram", 
		"valeria", "valerias", "valeria", "valeríamos", "valeríeis", "valeriam", 
		"valerei", "valerás", "valerá", "valeremos", "valereis", "valerão", 
		"valha", "valhas", "valha", "valhamos", "valhais", "valham", 
		"valesse", "valesses", "valesse", "valêssemos", "valêsseis", "valessem", 
		"valer", "valeres", "valer", "valermos", "valerdes", "valerem", 
		null, "vale", "valha", "valhamos", "valei", "valham", 
		null, "valhas", "valha", "valhamos", "valhais", "valham", 
		"valer", "valeres", "valer", "valermos", "valerdes", "valerem", 
	};
	
	final static String vender[] = {"vender", "vendendo", "vendido",
		"vendo", "vendes", "vende", "vendemos", "vendeis", "vendem", 
		"vendia", "vendias", "vendia", "vendíamos", "vendíeis", "vendiam", 
		"vendi", "vendeste", "vendeu", "vendemos", "vendestes", "venderam", 
		"vendera", "venderas", "vendera", "vendêramos", "vendêreis", "venderam", 
		"venderia", "venderias", "venderia", "venderíamos", "venderíeis", "venderiam", 
		"venderei", "venderás", "venderá", "venderemos", "vendereis", "venderão", 
		"venda", "vendas", "venda", "vendamos", "vendais", "vendam", 
		"vendesse", "vendesses", "vendesse", "vendêssemos", "vendêsseis", "vendessem", 
		"vender", "venderes", "vender", "vendermos", "venderdes", "venderem", 
		null, "vende", "venda", "vendamos", "vendei", "vendam", 
		null, "vendas", "venda", "vendamos", "vendais", "vendam", 
		"vender", "venderes", "vender", "vendermos", "venderdes", "venderem", 
	};
	
	final static String vestir[] = {"vestir", "vestindo", "vestido",
		"visto", "vestes", "veste", "vestimos", "vestis", "vestem", 
		"vestia", "vestias", "vestia", "vestíamos", "vestíeis", "vestiam", 
		"vesti", "vestiste", "vestiu", "vestimos", "vestistes", "vestiram", 
		"vestira", "vestiras", "vestira", "vestíramos", "vestíreis", "vestiram", 
		"vestiria", "vestirias", "vestiria", "vestiríamos", "vestiríeis", "vestiriam", 
		"vestirei", "vestirás", "vestirá", "vestiremos", "vestireis", "vestirão", 
		"vista", "vistas", "vista", "vistamos", "vistais", "vistam", 
		"vestisse", "vestisses", "vestisse", "vestíssemos", "vestísseis", "vestissem", 
		"vestir", "vestires", "vestir", "vestirmos", "vestirdes", "vestirem", 
		null, "veste", "vista", "vistamos", "vesti", "vistam", 
		null, "vistas", "vista", "vistamos", "vistais", "vistam", 
		"vestir", "vestires", "vestir", "vestirmos", "vestirdes", "vestirem", 
	};

	Map<String, String> conjugacoes = new TreeMap<String, String>();

	public Map<String, String> conjugar(String infinitivo) {
		if (isDefectivo(infinitivo)) {
			return conjugarDefectivoIrregular(infinitivo);
		} else {
			String conj[] = null;
			if (infinitivo.endsWith("ar")) conj = c1a;
			else if (infinitivo.endsWith("er") || (infinitivo.endsWith("or"))) conj = c2a;
			else if (infinitivo.endsWith("ir")) conj = c3a;
			else {
				System.out.println("Não consegui indentificar o verbo");
				System.exit(1);
			}
			return conjugar(infinitivo, conj, false);
		}
	}

	public Verbalizar() {
		defectivos.put("abaular", abaular);
		defectivos.put("abolir", abolir);
		defectivos.put("abraçar", abracar);
		defectivos.put("abrir", abrir);
		defectivos.put("acudir", acudir);
		defectivos.put("adequar", adequar);
		defectivos.put("adir", adir);
		defectivos.put("advertir", advertir);
		defectivos.put("advir", advir);
		defectivos.put("afligir", afligir);
		defectivos.put("aguar", aguar);
		defectivos.put("apaziguar", apaziguar);
		defectivos.put("apoiar", apoiar);
		defectivos.put("arguir", arguir);
		defectivos.put("arruinar", arruinar);
		defectivos.put("atribuir", atribuir);

		defectivos.put("bulir", bulir);

		defectivos.put("caber", caber);
		defectivos.put("cair", cair);
		defectivos.put("cantar", cantar);
		defectivos.put("cegar", cegar);
		defectivos.put("cerzir", cerzir);
		defectivos.put("chegar", chegar);
		defectivos.put("cobrir", cobrir);
		defectivos.put("compelir", compelir);
		defectivos.put("comprazer", comprazer);
		defectivos.put("comunicar", comunicar);
		defectivos.put("concernir", concernir);
		defectivos.put("conhecer", conhecer);
		defectivos.put("construir", construir);
		defectivos.put("conter", conter);
		defectivos.put("convergir", convergir);
		defectivos.put("crer", crer);
		defectivos.put("cuspir", cuspir);

		defectivos.put("denegrir", denegrir);
		defectivos.put("dizer", dizer);
		defectivos.put("doer", doer);
		defectivos.put("dormir", dormir);

		defectivos.put("embair", embair);
		defectivos.put("engolir", engolir);
		defectivos.put("enraizar", enraizar);
		defectivos.put("entupir", entupir);
		defectivos.put("enviuvar", enviuvar);
		defectivos.put("erguer", erguer);
		defectivos.put("escapulir", escapulir);
		defectivos.put("escrever", escrever);
		defectivos.put("esmiuçar", esmiucar);
		defectivos.put("espargir", espargir);
		defectivos.put("estar", estar);
		defectivos.put("estrear", estrear);
		defectivos.put("extinguir", extinguir);

		defectivos.put("faiscar", faiscar);
		defectivos.put("fazer", fazer);
		defectivos.put("feder", feder);
		defectivos.put("ferir", ferir);
		defectivos.put("frigir", frigir);
		defectivos.put("fugir", fugir);

		defectivos.put("haver", haver);

		defectivos.put("inquerir", inquerir);

		defectivos.put("jazer", jazer);

		defectivos.put("magoar", magoar);
		defectivos.put("mentir", mentir);
		defectivos.put("mobiliar", mobiliar);
		defectivos.put("moer", moer);
		defectivos.put("moscar", moscar);

		defectivos.put("odiar", odiar);
		defectivos.put("ouvir", ouvir);

		defectivos.put("partir", partir);
		defectivos.put("passear", passear);
		defectivos.put("pedir", pedir);
		defectivos.put("perder", perder);
		defectivos.put("poder", poder);
		defectivos.put("pôr", por);
		defectivos.put("precaver", precaver);
		defectivos.put("prevenir", prevenir);
		defectivos.put("progredir", progredir);
		defectivos.put("proibir", proibir);
		defectivos.put("propor", propor);
		defectivos.put("proteger", proteger);
		defectivos.put("prover", prover);

		defectivos.put("querer", querer);

		defectivos.put("reaver", reaver);
		defectivos.put("refletir", refletir);
		defectivos.put("requerer", requerer);
		defectivos.put("resfolegar", resfolegar);
		defectivos.put("ressarcir", ressarcir);
		defectivos.put("reunir", reunir);
		defectivos.put("ruir", ruir);

		defectivos.put("saber", saber);
		defectivos.put("saudar", saudar);
		defectivos.put("seguir", seguir);
		defectivos.put("servir", servir);
		defectivos.put("sortir", sortir);
		defectivos.put("subir", subir);
		defectivos.put("sumir", sumir);
		defectivos.put("surtir", surtir);

		defectivos.put("tossir", tossir);
		defectivos.put("traduzir", traduzir);
		defectivos.put("trazer", trazer);

		defectivos.put("urgir", urgir);

		defectivos.put("valer", valer);
		defectivos.put("vender", vender);
		defectivos.put("vestir", vestir);
	}

	public boolean isDefectivo(String verbo) {
		return defectivos.containsKey(verbo);
	}

	private Map<String, String> conjugarDefectivoIrregular(String verbo) {
		return conjugar(verbo, defectivos.get(verbo), true);
	}

	private String espacos(String p) {
		final int preEspacos = 80;
		int comp = preEspacos - p.length();
		StringBuilder sb = new StringBuilder(comp);
		for (int i = 0; i < comp; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public Map<String, String> conjugar(String verbo, String[] conjug, boolean defectivoIrregular) {
		int i = 0;
		String radical = verbo.substring(0, verbo.length() - 2);
		String flexao;
		for (String e : ftVerbais) {
			flexao = defectivoIrregular? conjug[i] : (conjug[i] != null? radical + conjug[i] : null);
			conjugacoes.put(e, flexao);
			System.out.println(e + espacos(e) + flexao);
			i++;
		}
		String pess;
		for (String e : fvVerbais) {
			for (String f : modVerbais) {
				for (String g : pesVerbais) {
					flexao = defectivoIrregular? conjug[i] : (conjug[i] != null? radical + conjug[i] : null);
					pess = g + " pessoa do " + f + " do " + e;
					conjugacoes.put(pess, flexao);
					System.out.println(pess + espacos(pess) + flexao);
					i++;
				}
			}
		}
//		for (Map.Entry<String, String> e : conjugacoes.entrySet()) {
//			if (conjug[i] != null) {
//				System.out.println(e.getKey() + " ----> " + radical + conjug[i]);
//				e.setValue(radical + conjug[i++]);
//			}
//		}
		return conjugacoes;
	}

	public static void main(String[] args) {
		Verbalizar programa = new Verbalizar();
		Map<String, String> conj = programa.conjugar("kjjijdedfrt");
		for (Map.Entry<String, String> it : conj.entrySet()) {
			System.out.printf("%s: %s\n", it.getKey(), it.getValue());
		}
	}
}
