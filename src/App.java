public class App {
	public static void main(String[] args) throws Exception {
		StorageDevice mySSD = new StorageDevice(1000, 4096);
		Directory directory = new Directory(mySSD, "myFolder");

		// # Initially, a directory takes no room
		System.out.println(">>Directory size in blocks\n" + directory.sizeInBlocks() + "\n");

		// # We add a file
		File file1 = new File(mySSD, "file1");
		file1.grow(5);
		directory.add(file1);

		// # The directory's size is the sum of all of its children's sizes
		System.out.println(">>Directory size in blocks\n" + directory.sizeInBlocks() + "\n");

		// # We add a second file
		File file2 = new File(mySSD, "file2");
		file2.grow(10);
		directory.add(file2);
		System.out.println(">>Directory size in blocks\n" + directory.sizeInBlocks() + "\n");

		// # We create a subdirectory and add a file to it
		Directory subDir = new Directory(mySSD, "supdir");
		directory.add(subDir);
		File file3 = new File(mySSD, "file3");
		file3.grow(20);
		subDir.add(file3);

		// # The directory's size has grown
		System.out.println(">>Directory size in blocks\n" + directory.sizeInBlocks() + "\n");

		// # All files are cleared recursively
		directory.clear();
		System.out.println(">>Directory size in blocks\n" + directory.sizeInBlocks() + "\n");
		System.out.println(">>File1 size in bytes\n" + file1.sizeInBlocks() + "\n");
		System.out.println(">>File2 size in bytes\n" + file2.sizeInBlocks() + "\n");
		System.out.println(">>File3 size in bytes\n" + file3.sizeInBlocks() + "\n");

		// System.out.println(">>File size in blocks\n" + file.sizeInBlocks() + "\n");

		// System.out.println(">>Storage free block count\n" + storage.freeBlocksCount() + "\n");
		// System.out.println(">>Storage used block count\n" + storage.usedBlocksCount() + "\n");

		// System.out.println(">>File size in bytes\n" + file.sizeInBytes() + "\n");

		// file.clear();

		// System.out.println(">>File size in blocks\n" + file.sizeInBlocks() + "\n");
		// System.out.println(">>Storage free block count\n" + storage.freeBlocksCount() + "\n");

		// System.out.println(">>Storage used block count\n" + storage.usedBlocksCount() + "\n");
	}
}
