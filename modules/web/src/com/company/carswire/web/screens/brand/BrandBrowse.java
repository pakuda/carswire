package com.company.carswire.web.screens.brand;

import com.haulmont.cuba.gui.screen.*;
import com.company.carswire.entity.Brand;

@UiController("carswire_Brand.browse")
@UiDescriptor("brand-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class BrandBrowse extends MasterDetailScreen<Brand> {
}