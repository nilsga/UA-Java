 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import java.util.Collection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opcfoundation.ua.builtintypes.Enumeration;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.core.Identifiers;



public enum PerformUpdateType implements Enumeration {

    Insert(1),
    Replace(2),
    Update(3),
    Remove(4);
	

	public static final NodeId ID = Identifiers.PerformUpdateType;
	public static EnumSet<PerformUpdateType> NONE = EnumSet.noneOf( PerformUpdateType.class );
	public static EnumSet<PerformUpdateType> ALL = EnumSet.allOf( PerformUpdateType.class );
	
	private final int value;
	PerformUpdateType(int value) {
		this.value = value;
	}
	
	@Override
	public int getValue() {
		return value;
	}

	private static final Map<Integer, PerformUpdateType> map;
	static {
		map = new HashMap<Integer, PerformUpdateType>();
		for (PerformUpdateType i : PerformUpdateType.values()) 
			map.put(i.value, i);        
	}

	public static PerformUpdateType valueOf(int value)
	{
		return map.get(value);
	}
	
	public static PerformUpdateType valueOf(Integer value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static PerformUpdateType valueOf(UnsignedInteger value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static PerformUpdateType[] valueOf(int[] value)
	{
		PerformUpdateType[] result = new PerformUpdateType[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

	public static PerformUpdateType[] valueOf(Integer[] value)
	{
		PerformUpdateType[] result = new PerformUpdateType[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}
	
	public static PerformUpdateType[] valueOf(UnsignedInteger[] value)
	{
		PerformUpdateType[] result = new PerformUpdateType[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

	public static UnsignedInteger getMask(PerformUpdateType...list) 
	{
		int result = 0;
		for (PerformUpdateType c : list)
			result |= c.value;
		return UnsignedInteger.getFromBits(result);
	}	

	public static UnsignedInteger getMask(Collection<PerformUpdateType> list) 
	{
		int result = 0;
		for (PerformUpdateType c : list)
			result |= c.value;
		return UnsignedInteger.getFromBits(result);
	}	

	public static EnumSet<PerformUpdateType> getSet(UnsignedInteger mask)
	{
		return getSet(mask.intValue());
	}
	
	public static EnumSet<PerformUpdateType> getSet(int mask)
	{
		List<PerformUpdateType> res = new ArrayList<PerformUpdateType>();
		for (PerformUpdateType l : PerformUpdateType.values()) 
			if ( (mask & l.value) == l.value )
				res.add(l);
		return EnumSet.copyOf(res);
	}	
	
}