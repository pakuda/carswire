package com.company.carswire.web.screens.model;

import com.haulmont.cuba.gui.screen.*;
import com.company.carswire.entity.Model;

@UiController("carswire_Model.browse")
@UiDescriptor("model-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ModelBrowse extends MasterDetailScreen<Model> {
}