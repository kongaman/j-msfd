package ck.learn.jpmfsd.a12.collections162SetsHashSets;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	
	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("this.getClass() is: " + this.getClass());
		System.out.println("obj.getClass() is: " + obj.getClass());
		if (this == obj) {
			return true;
		}
		
		if ((obj == null) || (this.getClass() != obj.getClass())) {
			return false;
		}
		String objName = ((HeavenlyBody) obj).getName();
		return this.name.equals(objName);
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode called");
		return this.name.hashCode() + 57;
	}

}
