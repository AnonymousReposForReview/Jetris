package tests.javafuzzer1262;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:31:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-32432L;
    public static double dFld=89.9611;
    public int iArrFld[][]=new int[N][N];

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i11) {

        int i12=-7, i13=-13, i14=153, iArr[]=new int[N];
        short s=-12350, sArr[]=new short[N];
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 9L);
        FuzzerUtils.init(iArr, -138);
        FuzzerUtils.init(sArr, (short)10430);
        FuzzerUtils.init(fArr, -71.328F);

        for (long l : lArr) {
            if (false) continue;
        }
        Test.instanceCount += i12;
        i11 -= i12;
        switch (((i12 >>> 1) % 4) + 122) {
        case 122:
            lArr[(i11 >>> 1) % N] = i11;
            i11 -= i12;
            iArr[(i12 >>> 1) % N] *= (int)Test.instanceCount;
            break;
        case 123:
            sArr[(i12 >>> 1) % N] = (short)i12;
            break;
        case 124:
            lArr[(i12 >>> 1) % N] = s;
            i12 ^= i11;
            break;
        case 125:
            for (i13 = 10; i13 < 198; i13++) {
                iArr[i13] ^= i12;
                fArr[i13] = 13;
                Test.instanceCount |= Test.instanceCount;
            }
            break;
        }
        vMeth_check_sum += i11 + i12 + s + i13 + i14 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(int i7, int i8) {

        int i9=19583, i10=8, i15=-248, i16=-108, i17=22566, i18=55223, iArr1[]=new int[N];
        long l1=20196L;
        float f1=2.867F;

        FuzzerUtils.init(iArr1, -2);

        for (i9 = 7; 199 > i9; i9++) {
            Test.instanceCount += (i9 * i9);
        }
        vMeth(i7);
        i15 = 383;
        do {
            for (l1 = 1; l1 < 4; l1++) {
                Test.dFld = i10;
                Test.instanceCount *= i7;
                i16 <<= -7216;
                i16 += (int)(l1 - i8);
                iArr1[i15 + 1] = i10;
            }
        } while (--i15 > 0);
        for (i17 = 3; 370 > i17; ++i17) {
            i8 = i8;
            Test.instanceCount = i15;
            Test.instanceCount += (long)f1;
            iArr1[i17 + 1] >>>= i8;
        }
        long meth_res = i7 + i8 + i9 + i10 + i15 + l1 + i16 + i17 + i18 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public double dMeth() {

        int i2=-11100, i3=-1, i4=33, i5=2, i6=12;
        double d=0.70042;
        float f=-95.618F;
        short s1=24671;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -5683423789868243312L);

        i2 >>= (int)(Test.instanceCount++);
        for (i3 = 6; i3 < 367; ++i3) {
            for (i5 = 1; 5 > i5; ++i5) {
                i2 >>= (i4--);
                switch (((((i4 + i3) >>> 1) % 2) * 5) + 46) {
                case 49:
                    if (i4 != 0) {
                    }
                    d = i4;
                    break;
                case 53:
                    i2 -= (int)((f + (--Test.instanceCount)) / (iMeth(i4, 83) | 1));
                    s1 = (short)Test.instanceCount;
                    iArrFld[i5][i5 - 1] = s1;
                    try {
                        i4 = (-34515 % i3);
                        i4 = (38002 % i6);
                        iArrFld[i5][i3] = (-51770 / i5);
                    } catch (ArithmeticException a_e) {}
                    break;
                }
                lArr1[i5 - 1] += (long)f;
                i4 *= i4;
                i6 -= i3;
                i6 += (int)Test.instanceCount;
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + s1 +
            FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-4, i1=-8, i19=0, i20=-49976, i21=-20774, i22=74;
        boolean b=false;
        double d1=1.86924;
        byte by=-30;
        short s2=23559;
        float fArr1[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(fArr1, -10.562F);
        FuzzerUtils.init(lArr2, 151L);

        for (i = 4; i < 214; i++) {
            Test.instanceCount += (i * i);
            Test.instanceCount += (long)(0.930F + (i * i));
            i1 = i1;
            if ((b = b) & b) break;
            if (b ^ ((--i1) > ((++i1) + dMeth()))) continue;
            d1 = 1;
            do {
                switch ((int)(((d1 % 3) * 5) + 35)) {
                case 38:
                    i1 += (int)(d1 * by);
                    break;
                case 46:
                    i1 -= (int)Test.instanceCount;
                    iArrFld[(int)(d1)][i] -= i;
                    i1 += (int)(-29.101F + (d1 * d1));
                    i1 >>= by;
                    break;
                case 48:
                    iArrFld[i - 1][(int)(d1)] <<= i1;
                    if (b) {
                        if (b) break;
                        i1 += (int)(d1 * d1);
                        for (i19 = 1; 1 > i19; ++i19) {
                            i1 = i19;
                            i1 = i19;
                            iArrFld[i + 1][i19 - 1] = (int)Test.instanceCount;
                            Test.instanceCount &= i19;
                        }
                        i1 += (int)d1;
                    }
                    break;
                }
                Test.instanceCount += (0 + (d1 * d1));
                for (i21 = (int)(d1); i21 < 1; i21++) {
                    switch ((int)((d1 % 6) + 82)) {
                    case 82:
                        i22 += i1;
                        break;
                    case 83:
                        i20 -= i19;
                        break;
                    case 84:
                        fArr1 = FuzzerUtils.float1array(N, (float)50.856F);
                        i20 += i;
                        break;
                    case 85:
                        iArrFld[i21][i21 + 1] = (int)Test.instanceCount;
                        break;
                    case 86:
                        Test.instanceCount += (long)Test.dFld;
                        break;
                    case 87:
                        lArr2[i21] += s2;
                        break;
                    default:
                        i1 <<= i21;
                    }
                }
            } while (++d1 < 120);
        }

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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}