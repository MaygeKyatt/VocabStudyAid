package com.maygekyatt;

public class Morph {
	private String morph, morphDef, word1, word1Def, word2, word2Def;

	/**
	 * Constructor
	 * @param morph Morph to be defined
	 * @param morphDef Definition of morph
	 * @param word1 First word that uses the morph
	 * @param word1Def Definition of word1
	 * @param word2 Second word that uses the morph
	 * @param word2Def Definition of word2
	 */
	public Morph(String morph, String morphDef, String word1, String word1Def, String word2, String word2Def) {
		this.morph = morph;
		this.morphDef = morphDef;
		this.word1 = word1;
		this.word1Def = word1Def;
		this.word2 = word2;
		this.word2Def = word2Def;
	}
}