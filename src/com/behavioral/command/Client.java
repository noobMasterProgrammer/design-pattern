package com.behavioral.command;

import com.behavioral.command.command.CloseCommand;
import com.behavioral.command.command.Command;
import com.behavioral.command.command.OpenCommand;
import com.behavioral.command.command.WriteCommand;
import com.behavioral.command.filesystem.FileSystem;
import com.behavioral.command.invoker.FileInvoker;
import com.behavioral.command.util.FileSystemUtil;

public class Client {

	public static void main(String[] args) {
		FileInvoker file=null;
		FileSystem fileSystem = FileSystemUtil.getFileSystem();

        Command openCommand = new OpenCommand(fileSystem);
        Command writeCommand = new WriteCommand(fileSystem);
        Command closeCommand = new CloseCommand(fileSystem);
        
        file = new FileInvoker(openCommand);
        file.execute();

        file = new FileInvoker(writeCommand);
        file.execute();
        
        file = new FileInvoker(closeCommand);
        file.execute();

        file = new FileInvoker();
        file.add(openCommand);
        file.add(writeCommand);
        file.add(closeCommand);
        file.executeAll();
        
	}

}
