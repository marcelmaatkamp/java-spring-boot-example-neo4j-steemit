package application.model.neo4j;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@NoArgsConstructor
@RelationshipEntity(type = "VOTE")
@RequiredArgsConstructor
public class Vote {

    @NonNull
    @StartNode
    public Account voter;

    @NonNull
    @EndNode
    public Permlink permlink;

    @NonNull
    @Property
    public int weight;

    @GraphId
    public Long id;
}
