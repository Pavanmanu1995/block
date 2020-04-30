package com.mindtree.cityblock.entity;

public class Block{
	private int blockid;
	private String blockname;

	public Block() {
	}

	public Block(int blockid, String blockname) {
		this.blockid = blockid;
		this.blockname = blockname;
	}

	public int getBlockid() {
		return blockid;
	}

	public void setBlockid(int blockid) {
		this.blockid = blockid;
	}

	public String getBlockname() {
		return blockname;
	}

	public void setBlockname(String blockname) {
		this.blockname = blockname;
	}

	@Override
	public String toString() {
		return "Block [blockid=" + blockid + ", blockname=" + blockname + "]";
	}

}
