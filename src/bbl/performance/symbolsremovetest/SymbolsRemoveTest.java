package bbl.performance.symbolsremovetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SymbolsRemoveTest {

	@Test
	void SymbolsRemoveCharArrayTest()
	{
		String strTest="abcdefara";
		SymbolsRemove symbolsRemove=new SymbolsRemoveCharArray();
		assertEquals("bcdefr",symbolsRemove.removeSymbol(strTest, 'a'));
		assertEquals("abcefara",symbolsRemove.removeSymbol(strTest, 'd'));
		assertEquals("abcdefara",symbolsRemove.removeSymbol(strTest, 'z'));
		assertEquals("",symbolsRemove.removeSymbol("", 'z'));
		assertEquals("",symbolsRemove.removeSymbol("aaaa", 'a'));
	}

	@Test
	void SymbolsRemoveStandartTest()
	{
		String strTest="abcdefara";
		SymbolsRemove symbolsRemove=new SymbolsRemoveStandart();
		assertEquals("bcdefr",symbolsRemove.removeSymbol(strTest, 'a'));
		assertEquals("abcefara",symbolsRemove.removeSymbol(strTest, 'd'));
		assertEquals("abcdefara",symbolsRemove.removeSymbol(strTest, 'z'));
		assertEquals("",symbolsRemove.removeSymbol("", 'z'));
		assertEquals("",symbolsRemove.removeSymbol("aaaa", 'a'));
	}
	
}
