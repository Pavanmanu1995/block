package com.mindtree.cityblock.entity;

public class City implements Comparable<City> {
	private int cityid;
	private String cityname;

	public City() {
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public City(int cityid, String cityname) {
		this.cityid = cityid;
		this.cityname = cityname;
	}
	

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + "]";
	}
	@Override
	public int compareTo(City o) {
		return cityname.compareTo(o.getCityname());
	}

}
