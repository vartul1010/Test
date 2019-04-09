package com.example.testapp;

public class MyPojo
{
    private String offset;

    private String[] org;

    private Records[] records;

    private String created;

    private String org_type;

    private String count;

    private String active;

    private String source;

    private String title;

    private String message;

    private String version;

    private String total;

    private String visualizable;

    private Field[] field;

    private String catalog_uuid;

    private String limit;

    private String created_date;

    private String updated_date;

    private String index_name;

    private String updated;

    private String[] sector;

    private String desc;

    private String status;

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    public String[] getOrg ()
    {
        return org;
    }

    public void setOrg (String[] org)
    {
        this.org = org;
    }

    public Records[] getRecords ()
    {
        return records;
    }

    public void setRecords (Records[] records)
    {
        this.records = records;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public String getOrg_type ()
    {
        return org_type;
    }

    public void setOrg_type (String org_type)
    {
        this.org_type = org_type;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getVisualizable ()
    {
        return visualizable;
    }

    public void setVisualizable (String visualizable)
    {
        this.visualizable = visualizable;
    }

    public Field[] getField ()
    {
        return field;
    }

    public void setField (Field[] field)
    {
        this.field = field;
    }

    public String getCatalog_uuid ()
    {
        return catalog_uuid;
    }

    public void setCatalog_uuid (String catalog_uuid)
    {
        this.catalog_uuid = catalog_uuid;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public String getCreated_date ()
    {
        return created_date;
    }

    public void setCreated_date (String created_date)
    {
        this.created_date = created_date;
    }

    public String getUpdated_date ()
    {
        return updated_date;
    }

    public void setUpdated_date (String updated_date)
    {
        this.updated_date = updated_date;
    }

    public String getIndex_name ()
    {
        return index_name;
    }

    public void setIndex_name (String index_name)
    {
        this.index_name = index_name;
    }

    public String getUpdated ()
    {
        return updated;
    }

    public void setUpdated (String updated)
    {
        this.updated = updated;
    }

    public String[] getSector ()
    {
        return sector;
    }

    public void setSector (String[] sector)
    {
        this.sector = sector;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [offset = "+offset+", org = "+org+", records = "+records+", created = "+created+", org_type = "+org_type+", count = "+count+", active = "+active+", source = "+source+", title = "+title+", message = "+message+", version = "+version+", total = "+total+", visualizable = "+visualizable+", field = "+field+", catalog_uuid = "+catalog_uuid+", limit = "+limit+", created_date = "+created_date+", updated_date = "+updated_date+", index_name = "+index_name+", updated = "+updated+", sector = "+sector+", desc = "+desc+", status = "+status+"]";
    }
}