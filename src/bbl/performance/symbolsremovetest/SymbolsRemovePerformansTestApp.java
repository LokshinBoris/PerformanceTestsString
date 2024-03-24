package bbl.performance.symbolsremovetest;

import java.util.Random;


public class SymbolsRemovePerformansTestApp 
{
	private static final int N_RUNS = 10000;
	private static final int N_SYMBOLS =1000;
	public static void main(String[] args)
	{
		String str = getStr(N_SYMBOLS);
		char symbol=getRandomSymbol();
		SymbolRemovePerformansTest testRemoveCharArray=getTest("test of RemoveSymbolsCharArray",N_RUNS,new SymbolsRemoveCharArray(),str, symbol);
		SymbolRemovePerformansTest testRemoveStandart =getTest("test of RemoveSymbolsStandart", N_RUNS,new SymbolsRemoveStandart(),str, symbol);
		testRemoveCharArray.run();
		testRemoveStandart.run();
	}
	
	private static SymbolRemovePerformansTest getTest( String displayName,int nRuns, 
			SymbolsRemove symbolsRemove, String str, char symbol)
	{	
		return new SymbolRemovePerformansTest(displayName, nRuns, symbolsRemove, str, symbol);
	}
	
	private static String getStr(int nSymbols)
	{
		StringBuffer stringBuffer= new StringBuffer("");
		
		for( int i=0; i<nSymbols; i++)
		{
			stringBuffer.append(getRandomSymbol());
		}
		
		return stringBuffer.toString();
	}
	
	private static char getRandomSymbol()
	{
		Random rn = new Random();
		int randomInt=rn.nextInt(96)+32;   // ASCII from Space(32) to more
		return (char)(' '+ randomInt);  
	}
		
}
