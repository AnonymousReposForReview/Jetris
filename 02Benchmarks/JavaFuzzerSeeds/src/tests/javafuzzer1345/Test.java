package tests.javafuzzer1345;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:32:41 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static volatile boolean bFld=false;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -8);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i6, int i7, int i8) {

        int i9=-57;

        i9 = i8;
        long meth_res = i6 + i7 + i8 + i9;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i=16426, i1=-234, i2=-149, i3=7, i4=-36538, i5=49811, i10=-33;
        byte by=-36;
        float f1=-62.101F;
        long l1=19027L, lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 0L);

        for (i = 6; i < 229; i++) {
            i1 -= (++by);
            if (i1 != 0) {
            }
            for (i2 = 1; i2 < 7; i2++) {
                for (i4 = 1; i4 < 2; i4++) {
                    by += (byte)i4;
                    by += (byte)(i4 * i2);
                    i5 = i4;
                    i1 -= i4;
                    i3 &= (Test.iArrFld[i + 1]--);
                    lArr[i4][i2] -= ((Test.iArrFld[i + 1]--) + iMeth1(i, i1, i1));
                }
                i1 += (i2 | (long)f1);
                for (l1 = i; l1 < 2; l1++) {
                    i5 += (int)(l1 ^ i4);
                    Test.iArrFld[(int)(l1 + 1)] |= (int)-40572L;
                }
            }
        }
        long meth_res = i + i1 + by + i2 + i3 + i4 + i5 + Float.floatToIntBits(f1) + l1 + i10 +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        float f=113.305F;
        int i11=7468, i12=-55252, i13=-11, i14=-36464, i15=-227, i16=14;
        short s=-28082, sArr[]=new short[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(sArr, (short)1598);
        FuzzerUtils.init(bArr, true);

        f -= iMeth();
        for (i11 = 12; 226 > i11; i11 += 2) {
            for (i13 = 1; i13 < 15; ++i13) {
                for (i15 = 1; i15 < 2; ++i15) {
                    s -= (short)-83.1016F;
                    i16 ^= i11;
                    i12 += (i15 * i15);
                    i12 += (((i15 * f) + Test.instanceCount) - Test.instanceCount);
                    l -= (long)-1.9863;
                    l = l;
                    switch ((i11 % 10) + 77) {
                    case 77:
                        sArr[i13] = (short)-74;
                    case 78:
                        f += -144;
                        f += f;
                        l += (i15 * i15);
                    case 79:
                        i12 += (int)l;
                        break;
                    case 80:
                        i16 += (int)(5243021967993098897L + (i15 * i15));
                        break;
                    case 81:
                        i12 >>= (int)l;
                    case 82:
                        Test.bFld = Test.bFld;
                        break;
                    case 83:
                        Test.instanceCount = i11;
                    case 84:
                        i16 = (int)f;
                        break;
                    case 85:
                        i12 += 163;
                        break;
                    case 86:
                        if (Test.bFld) continue;
                        break;
                    default:
                        bArr[i13 - 1] = Test.bFld;
                    }
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + i11 + i12 + i13 + i14 + i15 + i16 + s +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=-6;

        vMeth(Test.instanceCount);
        i17 = i17;


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
