import java.util.ArrayList;
import java.util.List;

public class StorageDevice {
	private int blockCount;
	private int blockSize;
	private List<Integer> freeBlocks = new ArrayList<Integer>();
	private List<Integer> usedBlocks = new ArrayList<Integer>();

	public StorageDevice(int blockCount, int blockSize) {
		this.blockCount = blockCount;
		this.blockSize = blockSize;
		this.freeBlocks = initFreeBlocks(blockCount);
	}

	public List<Integer> allocate(int blockCount) {
		if (freeBlocks.size() < blockCount) {
			throw new IllegalArgumentException("No available free space left");
		}
		for (int i = 0; i < blockCount; i++) {
			int block = freeBlocks.remove(0);
			usedBlocks.add(block);
		}
		return usedBlocks;
	}

	public List<Integer> free(List<Integer> blocks) {
		for (int i = 0; i < blocks.size(); i++) {
			int block = blocks.get(i);
			if (!usedBlocks.contains(block)) {
				throw new IllegalArgumentException("Block is not used");
			}
			usedBlocks.remove(usedBlocks.indexOf(block));
			freeBlocks.add(block);
		}
		freeBlocks.sort(null);
		return freeBlocks;
	}

	//INIT
	public List<Integer> initFreeBlocks(int blockCount) {
		for (int i = 0;i < blockCount ; i++) {
			freeBlocks.add(i);
		}
		return freeBlocks;
	}
	
	// GETTERS
	public int totalBlockCount() {
		return this.blockCount;
	}

	public int blockSize() {
		return this.blockSize;
	}

	public int freeBlocksCount() {
		return this.freeBlocks.size();
	}

	public int usedBlocksCount() {
		return this.usedBlocks.size();
	}

	@Override
	public String toString() {
		return "StorageDevice [blockCount=" + blockCount + ", blockSize=" + blockSize + ", freeBlocks=" + freeBlocks
				+ ", usedBlocks=" + usedBlocks + "]";
	}

}
