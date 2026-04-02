import java.util.ArrayList;

public class StorageDevice {

    private int blockCount;
    private int blockSize;
    private ArrayList<Integer> freeBlocks = new ArrayList<Integer>();
    private ArrayList<Integer> usedBlocks = new ArrayList<Integer>();

    public StorageDevice(int blockCount, int blockSize) {
        this.blockCount = blockCount;
        this.blockSize = blockSize;
        this.freeBlocks = initFreeBlocks(blockCount);
    }

    public ArrayList<Integer> allocate(int blockCount) {
        
        if (freeBlocks.size() < blockCount) {
            throw new IllegalArgumentException("No available free space left");
        }
        
        for (int i = 0; i < blockCount; i++) {
            int block = freeBlocks.remove(0);
            usedBlocks.add(block);
        }
        
        return usedBlocks;
    }

    //INIT
    public ArrayList<Integer> initFreeBlocks(int blockCount) {
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

}
