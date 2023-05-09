package dto.request.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class UserTokenResponse {

    @SerializedName("token")
    public String token;

    @SerializedName("expires")
    public String expires;

    @SerializedName("status")
    private String status;

    @SerializedName("result")
    public String result;
}
