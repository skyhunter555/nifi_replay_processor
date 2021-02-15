package ru.syntez.processors.replay.processor;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ru.syntez.processors.replay.processor.entities.OutputDocumentExt;
import ru.syntez.processors.replay.processor.entities.ReplayDocument;

@Mapper
public interface MapStructConverter {

     MapStructConverter MAPPER = Mappers.getMapper(MapStructConverter.class);

     @Mappings({
             @Mapping(source="documentType",   target="docType"),
             @Mapping(source="documentNumber", target="docNumber")
     })
     ReplayDocument convert(OutputDocumentExt outputDocumentExt);

}
