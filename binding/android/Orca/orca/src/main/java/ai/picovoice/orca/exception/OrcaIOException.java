/*
    Copyright 2024 Picovoice Inc.

    You may not use this file except in compliance with the license. A copy of the license is
    located in the "LICENSE" file accompanying this source.

    Unless required by applicable law or agreed to in writing, software distributed under the
    License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
    express or implied. See the License for the specific language governing permissions and
    limitations under the License.
*/

package ai.picovoice.orca;

public class OrcaIOException extends OrcaException {
    public OrcaIOException(Throwable cause) {
        super(cause);
    }

    public OrcaIOException(String message) {
        super(message);
    }

    public OrcaIOException(String message, String[] messageStack) {
        super(message, messageStack);
    }
}
