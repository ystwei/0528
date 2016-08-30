package com.weikun.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;

public class B {
	public static void main(String[] args) {
		new B().setAttribute();
	}
	public void setAttribute(){
		
		Path target=Paths.get("c://3000soft//2.png");
		
		DosFileAttributeView dos=Files.getFileAttributeView(target, DosFileAttributeView.class);
		try {
			dos.setReadOnly(true);
			dos.setArchive(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void copyFile(){
		
		Path source=Paths.get("c://1.png");
		Path target=Paths.get("c://3000soft//2.png");
		try {
			if(target.toFile().exists()){
				Files.delete(target);
			}
			
			//Files.copy(source, target ,StandardCopyOption.REPLACE_EXISTING);
			Files.move(source, target ,StandardCopyOption.ATOMIC_MOVE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void visitFile(){
		
		Path p=Paths.get("c://");
		
		try {
			Files.walkFileTree(p, new SimpleFileVisitor<Path>(){
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					// TODO Auto-generated method stub
					if(file.getFileName().toString().endsWith(".txt")){
						System.out.println(file.getFileName());
					}
					
					return FileVisitResult.CONTINUE;
				}
			
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
