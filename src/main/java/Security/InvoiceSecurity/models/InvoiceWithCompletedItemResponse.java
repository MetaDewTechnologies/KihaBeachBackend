package Security.InvoiceSecurity.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceWithCompletedItemResponse {
    private InvoiceWithItemsResponse invoiceWithItemsResponse;
    private Integer reorderInvoiceId;

    public InvoiceWithCompletedItemResponse(InvoiceDetailDTO invoiceDetail, List<InvoiceItemDetailDTO> invoiceItemDetailDTOList, Integer reorderInvoiceId) {
    }
}
