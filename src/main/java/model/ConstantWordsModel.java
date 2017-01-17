package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by oliver.eder on 1/12/2017.
 */
public class ConstantWordsModel {

    public static Map<String, String> constantWordsModelMap = new HashMap<String, String>();

    static {
        constantWordsModelMap.put("with", Tags.PREPOSITION);
        constantWordsModelMap.put("from", Tags.PREPOSITION);
        constantWordsModelMap.put("without", Tags.PREPOSITION);
        constantWordsModelMap.put("within", Tags.PREPOSITION);
        constantWordsModelMap.put("into", Tags.PREPOSITION);
        constantWordsModelMap.put("in", Tags.PREPOSITION);
        constantWordsModelMap.put("on", Tags.PREPOSITION);
        constantWordsModelMap.put("at", Tags.PREPOSITION);
        constantWordsModelMap.put("by", Tags.PREPOSITION);
        constantWordsModelMap.put("of", Tags.PREPOSITION);
        constantWordsModelMap.put("throughout", Tags.PREPOSITION);
        constantWordsModelMap.put("as", Tags.PREPOSITION);
        constantWordsModelMap.put("about", Tags.PREPOSITION);
        constantWordsModelMap.put("over", Tags.PREPOSITION);
        constantWordsModelMap.put("for", Tags.PREPOSITION);
        constantWordsModelMap.put("since", Tags.PREPOSITION);
        constantWordsModelMap.put("til", Tags.PREPOSITION);
        constantWordsModelMap.put("till", Tags.PREPOSITION);
        constantWordsModelMap.put("until", Tags.PREPOSITION);
        constantWordsModelMap.put("ago", Tags.PREPOSITION);
        constantWordsModelMap.put("before", Tags.PREPOSITION);
        constantWordsModelMap.put("after", Tags.PREPOSITION);
        constantWordsModelMap.put("against", Tags.PREPOSITION);
        constantWordsModelMap.put("between", Tags.PREPOSITION);
        constantWordsModelMap.put("amongst", Tags.PREPOSITION);
        constantWordsModelMap.put("than", Tags.PREPOSITION);
        constantWordsModelMap.put("across", Tags.PREPOSITION);


        constantWordsModelMap.put("and", Tags.AND_OR);
        constantWordsModelMap.put("or", Tags.AND_OR);

        constantWordsModelMap.put("but", Tags.CONJUNCTION);
        constantWordsModelMap.put("yet", Tags.CONJUNCTION);
        constantWordsModelMap.put("so", Tags.CONJUNCTION);
        constantWordsModelMap.put("although", Tags.CONJUNCTION);
        constantWordsModelMap.put("though", Tags.CONJUNCTION);
        constantWordsModelMap.put("because", Tags.CONJUNCTION);
        constantWordsModelMap.put("unless", Tags.CONJUNCTION);
        constantWordsModelMap.put("rather", Tags.CONJUNCTION);
        constantWordsModelMap.put("than", Tags.CONJUNCTION);
        constantWordsModelMap.put("while", Tags.CONJUNCTION);
        constantWordsModelMap.put("if", Tags.CONJUNCTION);
        constantWordsModelMap.put("else", Tags.CONJUNCTION);

        constantWordsModelMap.put("then", Tags.ADVERB);
        constantWordsModelMap.put("outside", Tags.ADVERB);
        constantWordsModelMap.put("inside", Tags.ADVERB);
        constantWordsModelMap.put("also", Tags.ADVERB);
        constantWordsModelMap.put("too", Tags.ADVERB);

        constantWordsModelMap.put("is", Tags.IS_ARE);
        constantWordsModelMap.put("are", Tags.IS_ARE);
        constantWordsModelMap.put("was", Tags.IS_ARE);
        constantWordsModelMap.put("were", Tags.IS_ARE);
        constantWordsModelMap.put("be", Tags.IS_ARE);
        constantWordsModelMap.put("been", Tags.IS_ARE);
        constantWordsModelMap.put("being", Tags.IS_ARE);

        constantWordsModelMap.put("to", Tags.TO);

        constantWordsModelMap.put("not", Tags.NOT);

        constantWordsModelMap.put("a", Tags.DETERMINER);
        constantWordsModelMap.put("an", Tags.DETERMINER);
        constantWordsModelMap.put("the", Tags.DETERMINER);

        constantWordsModelMap.put("might", Tags.MODAL_VERB);
        constantWordsModelMap.put("should", Tags.MODAL_VERB);
        constantWordsModelMap.put("shouldn't", Tags.MODAL_VERB);
        constantWordsModelMap.put("would", Tags.MODAL_VERB);
        constantWordsModelMap.put("wouldn't", Tags.MODAL_VERB);
        constantWordsModelMap.put("must", Tags.MODAL_VERB);
        constantWordsModelMap.put("can", Tags.MODAL_VERB);
        constantWordsModelMap.put("can't", Tags.MODAL_VERB);
        constantWordsModelMap.put("could", Tags.MODAL_VERB);
        constantWordsModelMap.put("couldn't", Tags.MODAL_VERB);

        constantWordsModelMap.put("all", Tags.QUANTIFIER);
        constantWordsModelMap.put("both", Tags.QUANTIFIER);
        constantWordsModelMap.put("half", Tags.QUANTIFIER);
        constantWordsModelMap.put("some", Tags.QUANTIFIER);
        constantWordsModelMap.put("any", Tags.QUANTIFIER);
        constantWordsModelMap.put("many", Tags.QUANTIFIER);
        constantWordsModelMap.put("most", Tags.QUANTIFIER);
        constantWordsModelMap.put("lot", Tags.QUANTIFIER);
        constantWordsModelMap.put("plenty", Tags.QUANTIFIER);
        constantWordsModelMap.put("each", Tags.QUANTIFIER);
        constantWordsModelMap.put("every", Tags.QUANTIFIER);
        constantWordsModelMap.put("more", Tags.QUANTIFIER);
        constantWordsModelMap.put("less", Tags.QUANTIFIER);
        constantWordsModelMap.put("least", Tags.QUANTIFIER);
        constantWordsModelMap.put("several", Tags.QUANTIFIER);
        constantWordsModelMap.put("much", Tags.QUANTIFIER);
        constantWordsModelMap.put("few", Tags.QUANTIFIER);


        constantWordsModelMap.put("have", Tags.HAVE);
        constantWordsModelMap.put("has", Tags.HAVE);
        constantWordsModelMap.put("had", Tags.HAVE);

        constantWordsModelMap.put("I", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("I've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("I'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("you", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("you've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("you'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("he", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("he's", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("he'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("she", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("she's", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("she'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("we", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("we've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("we'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("they", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("they've", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("they'll", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("us", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("hers", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("herself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("him", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("himself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("hisself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("it", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("itself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("me", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("myself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("oneself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("ourselves", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("ownself", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("self", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("them", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("themselves", Tags.PRONOUN_PERSONAL);
        constantWordsModelMap.put("ourselves", Tags.PRONOUN_PERSONAL);

        constantWordsModelMap.put("her", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("his", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("my", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("mine", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("our", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("ours", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("their", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("your", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("yours", Tags.PRONOUN_POSSESIVE);
        constantWordsModelMap.put("its", Tags.PRONOUN_POSSESIVE);

        constantWordsModelMap.put("what", Tags.WH_DETERMINER);
        constantWordsModelMap.put("which", Tags.WH_DETERMINER);
        constantWordsModelMap.put("who", Tags.WH_DETERMINER);
        constantWordsModelMap.put("whatever", Tags.WH_DETERMINER);
        constantWordsModelMap.put("whichever", Tags.WH_DETERMINER);
        constantWordsModelMap.put("whoever", Tags.WH_DETERMINER);
        constantWordsModelMap.put("who", Tags.WH_DETERMINER);

        constantWordsModelMap.put("whose", Tags.WH_PRONOUN_POSSESSIVE);

        constantWordsModelMap.put("that", Tags.WH_PRONOUN);
        constantWordsModelMap.put("this", Tags.WH_PRONOUN);
        constantWordsModelMap.put("those", Tags.WH_PRONOUN);
        constantWordsModelMap.put("these", Tags.WH_PRONOUN);

        constantWordsModelMap.put("how", Tags.WH_ADVERB);
        constantWordsModelMap.put("however", Tags.WH_ADVERB);
        constantWordsModelMap.put("whence", Tags.WH_ADVERB);
        constantWordsModelMap.put("when", Tags.WH_ADVERB);
        constantWordsModelMap.put("whenever", Tags.WH_ADVERB);
        constantWordsModelMap.put("where", Tags.WH_ADVERB);
        constantWordsModelMap.put("whereby", Tags.WH_ADVERB);
        constantWordsModelMap.put("wherever", Tags.WH_ADVERB);
        constantWordsModelMap.put("wherein", Tags.WH_ADVERB);
        constantWordsModelMap.put("whereof", Tags.WH_ADVERB);
        constantWordsModelMap.put("why", Tags.WH_ADVERB);

        constantWordsModelMap.put("there", Tags.THERE);
        constantWordsModelMap.put("there's", Tags.THERE);
        constantWordsModelMap.put("there're", Tags.THERE);

        constantWordsModelMap.put("here", Tags.HERE);
        constantWordsModelMap.put("here's", Tags.HERE);
        constantWordsModelMap.put("here're", Tags.HERE);

        constantWordsModelMap.put("do", Tags.DO);
        constantWordsModelMap.put("does", Tags.DO);
        constantWordsModelMap.put("did", Tags.DO);
        constantWordsModelMap.put("done", Tags.DO);

        constantWordsModelMap.put("don't", Tags.DO);
        constantWordsModelMap.put("doesn't", Tags.DO);
        constantWordsModelMap.put("didn't", Tags.DO);

        constantWordsModelMap.put("arose", Tags.VERB_ED);
        constantWordsModelMap.put("arisen", Tags.VERB_ED);
        constantWordsModelMap.put("awakened", Tags.VERB_ED);
        constantWordsModelMap.put("awoke", Tags.VERB_ED);
        constantWordsModelMap.put("awakened", Tags.VERB_ED);
        constantWordsModelMap.put("backslid", Tags.VERB_ED);
        constantWordsModelMap.put("backslidden", Tags.VERB_ED);
        constantWordsModelMap.put("bore", Tags.VERB_ED);
        constantWordsModelMap.put("born", Tags.VERB_ED);
        constantWordsModelMap.put("borne", Tags.VERB_ED);
        constantWordsModelMap.put("became", Tags.VERB_ED);
        constantWordsModelMap.put("began", Tags.VERB_ED);
        constantWordsModelMap.put("begun", Tags.VERB_ED);
        constantWordsModelMap.put("bent", Tags.VERB_ED);
        constantWordsModelMap.put("bid", Tags.VERB_ED);
        constantWordsModelMap.put("bidden", Tags.VERB_ED);
        constantWordsModelMap.put("bound", Tags.VERB_ED);
        constantWordsModelMap.put("bled", Tags.VERB_ED);
        constantWordsModelMap.put("blew", Tags.VERB_ED);
        constantWordsModelMap.put("blown", Tags.VERB_ED);
        constantWordsModelMap.put("broke", Tags.VERB_ED);
        constantWordsModelMap.put("broken", Tags.VERB_ED);
        constantWordsModelMap.put("bred", Tags.VERB_ED);
        constantWordsModelMap.put("brought", Tags.VERB_ED);
        constantWordsModelMap.put("built", Tags.VERB_ED);
        constantWordsModelMap.put("burnt", Tags.VERB_ED);
        constantWordsModelMap.put("bought", Tags.VERB_ED);
        constantWordsModelMap.put("chose", Tags.VERB_ED);
        constantWordsModelMap.put("chosen", Tags.VERB_ED);
        constantWordsModelMap.put("clung", Tags.VERB_ED);
        constantWordsModelMap.put("came", Tags.VERB_ED);
        constantWordsModelMap.put("dealt", Tags.VERB_ED);
        constantWordsModelMap.put("dug", Tags.VERB_ED);
        constantWordsModelMap.put("did", Tags.VERB_ED);
        constantWordsModelMap.put("done", Tags.VERB_ED);
        constantWordsModelMap.put("drew", Tags.VERB_ED);
        constantWordsModelMap.put("drawn", Tags.VERB_ED);
        constantWordsModelMap.put("dreamt", Tags.VERB_ED);
        constantWordsModelMap.put("drank", Tags.VERB_ED);
        constantWordsModelMap.put("drunk", Tags.VERB_ED);
        constantWordsModelMap.put("drove", Tags.VERB_ED);
        constantWordsModelMap.put("driven", Tags.VERB_ED);
        constantWordsModelMap.put("dwelt", Tags.VERB_ED);
        constantWordsModelMap.put("ate", Tags.VERB_ED);
        constantWordsModelMap.put("eaten", Tags.VERB_ED);
        constantWordsModelMap.put("fell", Tags.VERB_ED);
        constantWordsModelMap.put("fallen", Tags.VERB_ED);
        constantWordsModelMap.put("fed", Tags.VERB_ED);
        constantWordsModelMap.put("felt", Tags.VERB_ED);
        constantWordsModelMap.put("fought", Tags.VERB_ED);
        constantWordsModelMap.put("fled", Tags.VERB_ED);
        constantWordsModelMap.put("flung", Tags.VERB_ED);
        constantWordsModelMap.put("flew", Tags.VERB_ED);
        constantWordsModelMap.put("flown", Tags.VERB_ED);
        constantWordsModelMap.put("forbade", Tags.VERB_ED);
        constantWordsModelMap.put("forbidden", Tags.VERB_ED);
        constantWordsModelMap.put("forewent", Tags.VERB_ED);
        constantWordsModelMap.put("foregone", Tags.VERB_ED);
        constantWordsModelMap.put("foresaw", Tags.VERB_ED);
        constantWordsModelMap.put("foreseen", Tags.VERB_ED);
        constantWordsModelMap.put("foretold", Tags.VERB_ED);
        constantWordsModelMap.put("forgot", Tags.VERB_ED);
        constantWordsModelMap.put("forgotten", Tags.VERB_ED);
        constantWordsModelMap.put("forgave", Tags.VERB_ED);
        constantWordsModelMap.put("forgiven", Tags.VERB_ED);
        constantWordsModelMap.put("forsook", Tags.VERB_ED);
        constantWordsModelMap.put("forsaken", Tags.VERB_ED);
        constantWordsModelMap.put("froze", Tags.VERB_ED);
        constantWordsModelMap.put("frozen", Tags.VERB_ED);
        constantWordsModelMap.put("frostbit", Tags.VERB_ED);
        constantWordsModelMap.put("frostbitten", Tags.VERB_ED);
        constantWordsModelMap.put("got", Tags.VERB_ED);
        constantWordsModelMap.put("gave", Tags.VERB_ED);
        constantWordsModelMap.put("given", Tags.VERB_ED);
        constantWordsModelMap.put("went", Tags.VERB_ED);
        constantWordsModelMap.put("gone", Tags.VERB_ED);
        constantWordsModelMap.put("grew", Tags.VERB_ED);
        constantWordsModelMap.put("grown", Tags.VERB_ED);
        constantWordsModelMap.put("handwrote", Tags.VERB_ED);
        constantWordsModelMap.put("handwritten", Tags.VERB_ED);
        constantWordsModelMap.put("hung", Tags.VERB_ED);
        constantWordsModelMap.put("heard", Tags.VERB_ED);
        constantWordsModelMap.put("hewed", Tags.VERB_ED);
        constantWordsModelMap.put("hid", Tags.VERB_ED);
        constantWordsModelMap.put("hidden", Tags.VERB_ED);
        constantWordsModelMap.put("hit", Tags.VERB_ED);
        constantWordsModelMap.put("held", Tags.VERB_ED);
        constantWordsModelMap.put("hurt", Tags.VERB_ED);
        constantWordsModelMap.put("inbred", Tags.VERB_ED);
        constantWordsModelMap.put("inlaid", Tags.VERB_ED);
        constantWordsModelMap.put("interbred", Tags.VERB_ED);
        constantWordsModelMap.put("interwove", Tags.VERB_ED);
        constantWordsModelMap.put("interwoven", Tags.VERB_ED);
        constantWordsModelMap.put("interwound", Tags.VERB_ED);
        constantWordsModelMap.put("jerry-built", Tags.VERB_ED);
        constantWordsModelMap.put("kept", Tags.VERB_ED);
        constantWordsModelMap.put("knelt", Tags.VERB_ED);
        constantWordsModelMap.put("knew", Tags.VERB_ED);
        constantWordsModelMap.put("known", Tags.VERB_ED);
        constantWordsModelMap.put("laid", Tags.VERB_ED);
        constantWordsModelMap.put("led", Tags.VERB_ED);
        constantWordsModelMap.put("leant", Tags.VERB_ED);
        constantWordsModelMap.put("leapt", Tags.VERB_ED);
        constantWordsModelMap.put("learnt", Tags.VERB_ED);
        constantWordsModelMap.put("left", Tags.VERB_ED);
        constantWordsModelMap.put("lent", Tags.VERB_ED);
        constantWordsModelMap.put("let", Tags.VERB);
        constantWordsModelMap.put("lay", Tags.VERB_ED);
        constantWordsModelMap.put("lain", Tags.VERB_ED);
        constantWordsModelMap.put("lied", Tags.VERB_ED);
        constantWordsModelMap.put("lit", Tags.VERB_ED);
        constantWordsModelMap.put("lost", Tags.VERB_ED);
        constantWordsModelMap.put("made", Tags.VERB_ED);
        constantWordsModelMap.put("meant", Tags.VERB_ED);
        constantWordsModelMap.put("met", Tags.VERB_ED);
        constantWordsModelMap.put("miscast", Tags.VERB_ED);
        constantWordsModelMap.put("misdealt", Tags.VERB_ED);
        constantWordsModelMap.put("misdid", Tags.VERB_ED);
        constantWordsModelMap.put("misdone", Tags.VERB_ED);
        constantWordsModelMap.put("misheard", Tags.VERB_ED);
        constantWordsModelMap.put("mislaid", Tags.VERB_ED);
        constantWordsModelMap.put("misled", Tags.VERB_ED);
        constantWordsModelMap.put("mislearnt", Tags.VERB_ED);
        constantWordsModelMap.put("misread", Tags.VERB_ED);
        constantWordsModelMap.put("misset", Tags.VERB_ED);
        constantWordsModelMap.put("misspoke", Tags.VERB_ED);
        constantWordsModelMap.put("misspelt", Tags.VERB_ED);
        constantWordsModelMap.put("misspent", Tags.VERB_ED);
        constantWordsModelMap.put("mistook", Tags.VERB_ED);
        constantWordsModelMap.put("mistaken", Tags.VERB_ED);
        constantWordsModelMap.put("mistaught", Tags.VERB_ED);
        constantWordsModelMap.put("misunderstood", Tags.VERB_ED);
        constantWordsModelMap.put("miswrote", Tags.VERB_ED);
        constantWordsModelMap.put("miswritten", Tags.VERB_ED);
        constantWordsModelMap.put("mowed", Tags.VERB_ED);
        constantWordsModelMap.put("mown", Tags.VERB_ED);
        constantWordsModelMap.put("offset", Tags.VERB_ED);
        constantWordsModelMap.put("outbid", Tags.VERB_ED);
        constantWordsModelMap.put("outbred", Tags.VERB_ED);
        constantWordsModelMap.put("outdid", Tags.VERB_ED);
        constantWordsModelMap.put("outdone", Tags.VERB_ED);
        constantWordsModelMap.put("outdrew", Tags.VERB_ED);
        constantWordsModelMap.put("outdrawn", Tags.VERB_ED);
        constantWordsModelMap.put("outdrank", Tags.VERB_ED);
        constantWordsModelMap.put("outdrunk", Tags.VERB_ED);
        constantWordsModelMap.put("outdrove", Tags.VERB_ED);
        constantWordsModelMap.put("outdriven", Tags.VERB_ED);
        constantWordsModelMap.put("outdriven", Tags.VERB_ED);
        constantWordsModelMap.put("outfought", Tags.VERB_ED);
        constantWordsModelMap.put("outflew", Tags.VERB_ED);
        constantWordsModelMap.put("outflown", Tags.VERB_ED);
        constantWordsModelMap.put("outgrew", Tags.VERB_ED);
        constantWordsModelMap.put("outgrown", Tags.VERB_ED);
        constantWordsModelMap.put("outleapt", Tags.VERB_ED);
        constantWordsModelMap.put("outlied", Tags.VERB_ED);
        constantWordsModelMap.put("outrode", Tags.VERB_ED);
        constantWordsModelMap.put("outridden", Tags.VERB_ED);
        constantWordsModelMap.put("outran", Tags.VERB_ED);
        constantWordsModelMap.put("outrun", Tags.VERB_ED);
        constantWordsModelMap.put("outsold", Tags.VERB_ED);
        constantWordsModelMap.put("outshone", Tags.VERB_ED);
        constantWordsModelMap.put("outshot", Tags.VERB_ED);
        constantWordsModelMap.put("outsang", Tags.VERB_ED);
        constantWordsModelMap.put("outsung", Tags.VERB_ED);
        constantWordsModelMap.put("outsat", Tags.VERB_ED);
        constantWordsModelMap.put("outslept", Tags.VERB_ED);
        constantWordsModelMap.put("outsmelt", Tags.VERB_ED);
        constantWordsModelMap.put("outspoke", Tags.VERB_ED);
        constantWordsModelMap.put("outspoken", Tags.VERB_ED);
        constantWordsModelMap.put("outsped", Tags.VERB_ED);
        constantWordsModelMap.put("outsped", Tags.VERB_ED);
        constantWordsModelMap.put("outspent", Tags.VERB_ED);
        constantWordsModelMap.put("outswore", Tags.VERB_ED);
        constantWordsModelMap.put("outsworn", Tags.VERB_ED);
        constantWordsModelMap.put("outswam", Tags.VERB_ED);
        constantWordsModelMap.put("outswum", Tags.VERB_ED);
        constantWordsModelMap.put("outthought", Tags.VERB_ED);
        constantWordsModelMap.put("outthrew", Tags.VERB_ED);
        constantWordsModelMap.put("outthrown", Tags.VERB_ED);
        constantWordsModelMap.put("outthrown", Tags.VERB_ED);
        constantWordsModelMap.put("outwrote", Tags.VERB_ED);
        constantWordsModelMap.put("outwritten", Tags.VERB_ED);
        constantWordsModelMap.put("overbid", Tags.VERB_ED);
        constantWordsModelMap.put("overbred", Tags.VERB_ED);
        constantWordsModelMap.put("overbuilt", Tags.VERB_ED);
        constantWordsModelMap.put("overbought", Tags.VERB_ED);
        constantWordsModelMap.put("overcame", Tags.VERB_ED);
        constantWordsModelMap.put("overdid", Tags.VERB_ED);
        constantWordsModelMap.put("overdone", Tags.VERB_ED);
        constantWordsModelMap.put("overdrew", Tags.VERB_ED);
        constantWordsModelMap.put("overdrawn", Tags.VERB_ED);
        constantWordsModelMap.put("overdrank", Tags.VERB_ED);
        constantWordsModelMap.put("overdrunk", Tags.VERB_ED);
        constantWordsModelMap.put("overate", Tags.VERB_ED);
        constantWordsModelMap.put("overeaten", Tags.VERB_ED);
        constantWordsModelMap.put("overfed", Tags.VERB_ED);
        constantWordsModelMap.put("overhung", Tags.VERB_ED);
        constantWordsModelMap.put("overheard", Tags.VERB_ED);
        constantWordsModelMap.put("overlaid", Tags.VERB_ED);
        constantWordsModelMap.put("overpaid", Tags.VERB_ED);
        constantWordsModelMap.put("overrode", Tags.VERB_ED);
        constantWordsModelMap.put("overridden", Tags.VERB_ED);
        constantWordsModelMap.put("overran", Tags.VERB_ED);
        constantWordsModelMap.put("overrun", Tags.VERB_ED);
        constantWordsModelMap.put("oversaw", Tags.VERB_ED);
        constantWordsModelMap.put("overseen", Tags.VERB_ED);
        constantWordsModelMap.put("oversold", Tags.VERB_ED);
        constantWordsModelMap.put("oversewed", Tags.VERB_ED);
        constantWordsModelMap.put("oversewn", Tags.VERB_ED);
        constantWordsModelMap.put("overshot", Tags.VERB_ED);
        constantWordsModelMap.put("overslept", Tags.VERB_ED);
        constantWordsModelMap.put("overspoke", Tags.VERB_ED);
        constantWordsModelMap.put("overspoken", Tags.VERB_ED);
        constantWordsModelMap.put("overspent", Tags.VERB_ED);
        constantWordsModelMap.put("overspilt", Tags.VERB_ED);
        constantWordsModelMap.put("overtook", Tags.VERB_ED);
        constantWordsModelMap.put("overtaken", Tags.VERB_ED);
        constantWordsModelMap.put("overthought", Tags.VERB_ED);
        constantWordsModelMap.put("overthrew", Tags.VERB_ED);
        constantWordsModelMap.put("overthrown", Tags.VERB_ED);
        constantWordsModelMap.put("overwound", Tags.VERB_ED);
        constantWordsModelMap.put("overwrote", Tags.VERB_ED);
        constantWordsModelMap.put("overwritten", Tags.VERB_ED);
        constantWordsModelMap.put("partook", Tags.VERB_ED);
        constantWordsModelMap.put("partaken", Tags.VERB_ED);
        constantWordsModelMap.put("partook", Tags.VERB_ED);
        constantWordsModelMap.put("paid", Tags.VERB_ED);
        constantWordsModelMap.put("pled", Tags.VERB_ED);
        constantWordsModelMap.put("prebuilt", Tags.VERB_ED);
        constantWordsModelMap.put("predid", Tags.VERB_ED);
        constantWordsModelMap.put("predone", Tags.VERB_ED);
        constantWordsModelMap.put("premade", Tags.VERB_ED);
        constantWordsModelMap.put("prepaid", Tags.VERB_ED);
        constantWordsModelMap.put("presold", Tags.VERB_ED);
        constantWordsModelMap.put("preset", Tags.VERB_ED);
        constantWordsModelMap.put("preshrank", Tags.VERB_ED);
        constantWordsModelMap.put("preshrunk", Tags.VERB_ED);
        constantWordsModelMap.put("proofread", Tags.VERB_ED);
        constantWordsModelMap.put("proved", Tags.VERB_ED);
        constantWordsModelMap.put("put", Tags.VERB);
        constantWordsModelMap.put("quit", Tags.VERB);
        constantWordsModelMap.put("read", Tags.VERB);
        constantWordsModelMap.put("reawoke", Tags.VERB_ED);
        constantWordsModelMap.put("reawaken", Tags.VERB_ED);
        constantWordsModelMap.put("rebid", Tags.VERB_ED);
        constantWordsModelMap.put("rebound", Tags.VERB_ED);
        constantWordsModelMap.put("rebuilt", Tags.VERB_ED);
        constantWordsModelMap.put("recast", Tags.VERB_ED);
        constantWordsModelMap.put("recut", Tags.VERB_ED);
        constantWordsModelMap.put("redealt", Tags.VERB_ED);
        constantWordsModelMap.put("redid", Tags.VERB_ED);
        constantWordsModelMap.put("redone", Tags.VERB_ED);
        constantWordsModelMap.put("redrew", Tags.VERB_ED);
        constantWordsModelMap.put("redrawn", Tags.VERB_ED);
        constantWordsModelMap.put("refit", Tags.VERB_ED);
        constantWordsModelMap.put("reground", Tags.VERB_ED);
        constantWordsModelMap.put("regrew", Tags.VERB_ED);
        constantWordsModelMap.put("regrown", Tags.VERB_ED);
        constantWordsModelMap.put("rehung", Tags.VERB_ED);
        constantWordsModelMap.put("reheard", Tags.VERB_ED);
        constantWordsModelMap.put("reknit", Tags.VERB_ED);
        constantWordsModelMap.put("relaid", Tags.VERB_ED);
        constantWordsModelMap.put("relayed", Tags.VERB_ED);
        constantWordsModelMap.put("relearnt", Tags.VERB_ED);
        constantWordsModelMap.put("relit", Tags.VERB_ED);
        constantWordsModelMap.put("remade", Tags.VERB_ED);
        constantWordsModelMap.put("repaid", Tags.VERB_ED);
        constantWordsModelMap.put("reread", Tags.VERB_ED);
        constantWordsModelMap.put("reran", Tags.VERB_ED);
        constantWordsModelMap.put("rerun", Tags.VERB_ED);
        constantWordsModelMap.put("resold", Tags.VERB_ED);
        constantWordsModelMap.put("reset", Tags.VERB_ED);
        constantWordsModelMap.put("resewed", Tags.VERB_ED);
        constantWordsModelMap.put("resewn", Tags.VERB_ED);
        constantWordsModelMap.put("retook", Tags.VERB_ED);
        constantWordsModelMap.put("retaken", Tags.VERB_ED);
        constantWordsModelMap.put("retaught", Tags.VERB_ED);
        constantWordsModelMap.put("retore", Tags.VERB_ED);
        constantWordsModelMap.put("retorn", Tags.VERB_ED);
        constantWordsModelMap.put("retold", Tags.VERB_ED);
        constantWordsModelMap.put("rethought", Tags.VERB_ED);
        constantWordsModelMap.put("retread", Tags.VERB_ED);
        constantWordsModelMap.put("retrofitted", Tags.VERB_ED);
        constantWordsModelMap.put("rewoke", Tags.VERB_ED);
        constantWordsModelMap.put("rewaken", Tags.VERB_ED);
        constantWordsModelMap.put("rewore", Tags.VERB_ED);
        constantWordsModelMap.put("reworn", Tags.VERB_ED);
        constantWordsModelMap.put("rewove", Tags.VERB_ED);
        constantWordsModelMap.put("rewoven", Tags.VERB_ED);
        constantWordsModelMap.put("rewed", Tags.VERB_ED);
        constantWordsModelMap.put("rewon", Tags.VERB_ED);
        constantWordsModelMap.put("rewound", Tags.VERB_ED);
        constantWordsModelMap.put("rewrote", Tags.VERB_ED);
        constantWordsModelMap.put("rewritten", Tags.VERB_ED);
        constantWordsModelMap.put("rid", Tags.VERB_ED);
        constantWordsModelMap.put("rode", Tags.VERB_ED);
        constantWordsModelMap.put("rang", Tags.VERB_ED);
        constantWordsModelMap.put("rung", Tags.VERB_ED);
        constantWordsModelMap.put("rose", Tags.VERB_ED);
        constantWordsModelMap.put("risen", Tags.VERB_ED);
        constantWordsModelMap.put("ran", Tags.VERB_ED);
        constantWordsModelMap.put("run", Tags.VERB_ED);
        constantWordsModelMap.put("sawed", Tags.VERB_ED);
        constantWordsModelMap.put("sawn", Tags.VERB_ED);
        constantWordsModelMap.put("said", Tags.VERB_ED);
        constantWordsModelMap.put("saw", Tags.VERB_ED);
        constantWordsModelMap.put("seen", Tags.VERB_ED);
        constantWordsModelMap.put("sought", Tags.VERB_ED);
        constantWordsModelMap.put("sold", Tags.VERB_ED);
        constantWordsModelMap.put("sent", Tags.VERB_ED);
        constantWordsModelMap.put("set", Tags.VERB_ED);
        constantWordsModelMap.put("sewed", Tags.VERB_ED);
        constantWordsModelMap.put("sewn", Tags.VERB_ED);
        constantWordsModelMap.put("shook", Tags.VERB_ED);
        constantWordsModelMap.put("shaken", Tags.VERB_ED);
        constantWordsModelMap.put("shaved", Tags.VERB_ED);
        constantWordsModelMap.put("shaven", Tags.VERB_ED);
        constantWordsModelMap.put("sheared", Tags.VERB_ED);
        constantWordsModelMap.put("shorn", Tags.VERB_ED);
        constantWordsModelMap.put("shed", Tags.VERB_ED);
        constantWordsModelMap.put("shined", Tags.VERB_ED);
        constantWordsModelMap.put("shone", Tags.VERB_ED);
        constantWordsModelMap.put("shitted", Tags.VERB_ED);
        constantWordsModelMap.put("shat", Tags.VERB_ED);
        constantWordsModelMap.put("shot", Tags.VERB_ED);
        constantWordsModelMap.put("showed", Tags.VERB_ED);
        constantWordsModelMap.put("shown", Tags.VERB_ED);
        constantWordsModelMap.put("shrank", Tags.VERB_ED);
        constantWordsModelMap.put("shrunk", Tags.VERB_ED);
        constantWordsModelMap.put("shut", Tags.VERB_ED);
        constantWordsModelMap.put("sang", Tags.VERB_ED);
        constantWordsModelMap.put("sung", Tags.VERB_ED);
        constantWordsModelMap.put("sank", Tags.VERB_ED);
        constantWordsModelMap.put("sunk", Tags.VERB_ED);
        constantWordsModelMap.put("sat", Tags.VERB_ED);
        constantWordsModelMap.put("slew", Tags.VERB_ED);
        constantWordsModelMap.put("slayed", Tags.VERB_ED);
        constantWordsModelMap.put("slept", Tags.VERB_ED);
        constantWordsModelMap.put("slid", Tags.VERB_ED);
        constantWordsModelMap.put("slung", Tags.VERB_ED);
        constantWordsModelMap.put("slunk", Tags.VERB_ED);
        constantWordsModelMap.put("slit", Tags.VERB_ED);
        constantWordsModelMap.put("smelt", Tags.VERB_ED);
        constantWordsModelMap.put("snuck", Tags.VERB_ED);
        constantWordsModelMap.put("sowed", Tags.VERB_ED);
        constantWordsModelMap.put("sown", Tags.VERB_ED);
        constantWordsModelMap.put("spoke", Tags.VERB_ED);
        constantWordsModelMap.put("sped", Tags.VERB_ED);
        constantWordsModelMap.put("spelt", Tags.VERB_ED);
        constantWordsModelMap.put("spent", Tags.VERB_ED);
        constantWordsModelMap.put("spilt", Tags.VERB_ED);
        constantWordsModelMap.put("spun", Tags.VERB_ED);
        constantWordsModelMap.put("spat", Tags.VERB_ED);
        constantWordsModelMap.put("spoilt", Tags.VERB_ED);
        constantWordsModelMap.put("sprang", Tags.VERB_ED);
        constantWordsModelMap.put("sprung", Tags.VERB_ED);
        constantWordsModelMap.put("stood", Tags.VERB_ED);
        constantWordsModelMap.put("stole", Tags.VERB_ED);
        constantWordsModelMap.put("stolen", Tags.VERB_ED);
        constantWordsModelMap.put("stuck", Tags.VERB_ED);
        constantWordsModelMap.put("stung", Tags.VERB_ED);
        constantWordsModelMap.put("stunk", Tags.VERB_ED);
        constantWordsModelMap.put("stank", Tags.VERB_ED);
        constantWordsModelMap.put("strewed", Tags.VERB_ED);
        constantWordsModelMap.put("strewn", Tags.VERB_ED);
        constantWordsModelMap.put("strode", Tags.VERB_ED);
        constantWordsModelMap.put("stridden", Tags.VERB_ED);
        constantWordsModelMap.put("struck", Tags.VERB_ED);
        constantWordsModelMap.put("stricken", Tags.VERB_ED);
        constantWordsModelMap.put("strung", Tags.VERB_ED);
        constantWordsModelMap.put("strove", Tags.VERB_ED);
        constantWordsModelMap.put("striven", Tags.VERB_ED);
        constantWordsModelMap.put("sunburnt", Tags.VERB_ED);
        constantWordsModelMap.put("swore", Tags.VERB_ED);
        constantWordsModelMap.put("sworn", Tags.VERB_ED);
        constantWordsModelMap.put("swept", Tags.VERB_ED);
        constantWordsModelMap.put("swollen", Tags.VERB_ED);
        constantWordsModelMap.put("swam", Tags.VERB_ED);
        constantWordsModelMap.put("swum", Tags.VERB_ED);
        constantWordsModelMap.put("swung", Tags.VERB_ED);
        constantWordsModelMap.put("took", Tags.VERB_ED);
        constantWordsModelMap.put("taken", Tags.VERB_ED);
        constantWordsModelMap.put("taught", Tags.VERB_ED);
        constantWordsModelMap.put("tore", Tags.VERB_ED);
        constantWordsModelMap.put("torn", Tags.VERB_ED);
        constantWordsModelMap.put("told", Tags.VERB_ED);
        constantWordsModelMap.put("thought", Tags.VERB_ED);
        constantWordsModelMap.put("threw", Tags.VERB_ED);
        constantWordsModelMap.put("thrown", Tags.VERB_ED);
        constantWordsModelMap.put("trod", Tags.VERB_ED);
        constantWordsModelMap.put("trodden", Tags.VERB_ED);
        constantWordsModelMap.put("typewrote", Tags.VERB_ED);
        constantWordsModelMap.put("typewritten", Tags.VERB_ED);
        constantWordsModelMap.put("unbent", Tags.VERB_ED);
        constantWordsModelMap.put("unbound", Tags.VERB_ED);
        constantWordsModelMap.put("unclad", Tags.VERB_ED);
        constantWordsModelMap.put("underfed", Tags.VERB_ED);
        constantWordsModelMap.put("underwent", Tags.VERB_ED);
        constantWordsModelMap.put("undergone", Tags.VERB_ED);
        constantWordsModelMap.put("underlay", Tags.VERB_ED);
        constantWordsModelMap.put("underlain", Tags.VERB_ED);
        constantWordsModelMap.put("undersold", Tags.VERB_ED);
        constantWordsModelMap.put("underspent", Tags.VERB_ED);
        constantWordsModelMap.put("understood", Tags.VERB_ED);
        constantWordsModelMap.put("undertook", Tags.VERB_ED);
        constantWordsModelMap.put("undertaken", Tags.VERB_ED);
        constantWordsModelMap.put("underwrote", Tags.VERB_ED);
        constantWordsModelMap.put("underwritten", Tags.VERB_ED);
        constantWordsModelMap.put("undid", Tags.VERB_ED);
        constantWordsModelMap.put("undone", Tags.VERB_ED);
        constantWordsModelMap.put("unfroze", Tags.VERB_ED);
        constantWordsModelMap.put("unfrozen", Tags.VERB_ED);
        constantWordsModelMap.put("unhung", Tags.VERB_ED);
        constantWordsModelMap.put("unhid", Tags.VERB_ED);
        constantWordsModelMap.put("unhidden", Tags.VERB_ED);
        constantWordsModelMap.put("unknit", Tags.VERB_ED);
        constantWordsModelMap.put("unlearnt", Tags.VERB_ED);
        constantWordsModelMap.put("unsewed", Tags.VERB_ED);
        constantWordsModelMap.put("unsewn", Tags.VERB_ED);
        constantWordsModelMap.put("unslung", Tags.VERB_ED);
        constantWordsModelMap.put("unspun", Tags.VERB_ED);
        constantWordsModelMap.put("unstuck", Tags.VERB_ED);
        constantWordsModelMap.put("unstrung", Tags.VERB_ED);
        constantWordsModelMap.put("unwove", Tags.VERB_ED);
        constantWordsModelMap.put("unwoven", Tags.VERB_ED);
        constantWordsModelMap.put("unwound", Tags.VERB_ED);
        constantWordsModelMap.put("upheld", Tags.VERB_ED);
        constantWordsModelMap.put("woke", Tags.VERB_ED);
        constantWordsModelMap.put("woken", Tags.VERB_ED);
        constantWordsModelMap.put("waylaid", Tags.VERB_ED);
        constantWordsModelMap.put("wore", Tags.VERB_ED);
        constantWordsModelMap.put("worn", Tags.VERB_ED);
        constantWordsModelMap.put("wove", Tags.VERB_ED);
        constantWordsModelMap.put("woven", Tags.VERB_ED);
        constantWordsModelMap.put("wept", Tags.VERB_ED);
        constantWordsModelMap.put("won", Tags.VERB_ED);
        constantWordsModelMap.put("wound", Tags.VERB_ED);
        constantWordsModelMap.put("withdrew", Tags.VERB_ED);
        constantWordsModelMap.put("withdrawn", Tags.VERB_ED);
        constantWordsModelMap.put("withheld", Tags.VERB_ED);
        constantWordsModelMap.put("withstood", Tags.VERB_ED);
        constantWordsModelMap.put("wrung", Tags.VERB_ED);
        constantWordsModelMap.put("wrote", Tags.VERB_ED);
        constantWordsModelMap.put("written", Tags.VERB_ED);
    }
}
