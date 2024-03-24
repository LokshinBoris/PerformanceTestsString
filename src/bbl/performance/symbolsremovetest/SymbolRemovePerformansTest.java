package bbl.performance.symbolsremovetest;

import bbl.performance.PerformanceTest;

public class SymbolRemovePerformansTest extends PerformanceTest 
{
    String str;
    SymbolsRemove symbolsRemove;
    char symbol;
	public SymbolRemovePerformansTest(String displayName, int nRuns,
			SymbolsRemove symbolsRemove, String str,char symbol)
	{
		super(displayName, nRuns);
		this.symbolsRemove = symbolsRemove;
		this.str = str;
		this.symbol=symbol;
		
	}
	@Override
	protected void runTest()
	{
		symbolsRemove.removeSymbol(str, symbol);
	}	

}
