# MergeTag
>- [Sample](#sample)
>- [Usage](#usage)

MergeTag is a demo for using <merge/> in xml, to avoid Layout nested a Layout which not needed.

##sample
>Not using `<merge/>`:

![](https://github.com/Yangmxi/MergeTag/raw/master/ImageCache/NotMerge.png) 

>After using `<merge/>`

![](https://github.com/Yangmxi/MergeTag/raw/master/ImageCache/afterMerge.png) 

##usage

That's easy to use. Just use `<merge/>` instead of `<RelativeLayout>`

### Improtant
`<merge/>` can NOT use inflater.inflate(id, null). Because the merge MUST give a parent `Layout`
the mean of it is merge the xml and Layout (RelativeLayout or LinearLayout)

```java
    private void initView(Context context) {
        View.inflate(context, R.layout.setting_item_view, this);
        
        cb_update = (CheckBox) findViewById(R.id.cb_isupdate);
        tv_update_title = (TextView) findViewById(R.id.tv_update_title);
        tv_update_content = (TextView) findViewById(R.id.tv_update_content);

    }
