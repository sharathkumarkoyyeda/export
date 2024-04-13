

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.asm.Advice.This;

public class Demo  {
	
	Demo(int i)
	{
		System.out.println("no arg");
	}
	Demo ()
	{
		this(5);	
		System.out.println("demo const child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("  demo");
    

	}

}
